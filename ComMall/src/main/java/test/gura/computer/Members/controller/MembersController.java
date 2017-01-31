package test.gura.computer.Members.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import test.gura.computer.Members.dto.MembersDto;
import test.gura.computer.Members.service.MembersService;

@Controller
@RequestMapping("/users")
public class MembersController {
	@Autowired
	private MembersService service;

	@RequestMapping(value = "/**/", params = "type=view")
	public void MoveForm() {
	}
	//회원가입
	@RequestMapping(value ="/signup.do")
	@ResponseBody
	public int Insert(@ModelAttribute MembersDto dto) {
		
		return service.insert(dto);
	}
	
	//아이디 체크
	@RequestMapping("/idCheck.do")
	@ResponseBody
	public boolean IdCheck(@RequestParam String id){
		return service.checkedId(id);
	}
	//로그인
	@RequestMapping("/signin")
	public String Signin(@ModelAttribute MembersDto dto,HttpSession session){
		boolean success = service.isValid(dto);
		if(success){
			session.setAttribute("id", dto.getMemberId());
			return "redirect:/home.do";
		}else{
			return "redirect:/users/signin_form.do?type=view";
		}
	}
	//로그아웃
	@RequestMapping("logout")
	public String Logout(HttpSession session){
		session.removeAttribute("id");
		return "redirect:/home.do";
	}
	
	@RequestMapping(value = "/**/", params="type=data")
	public void MoveDataForm(HttpSession session,Model model){
		String id = (String) session.getAttribute("id");
		model.addAttribute("dto",service.getData(id));
	}
	@RequestMapping("/private/update")
	@ResponseBody
	public int Update(@ModelAttribute MembersDto dto,HttpSession session){
		String id = (String) session.getAttribute("id");
		dto.setMemberId(id);
		return service.update(dto);
	}

}
