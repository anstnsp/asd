package test.gura.computer.qna.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dto.QAWriterDto;
import test.gura.computer.qna.service.QAWriterService;

@Controller
public class QAWriterController {
	
	@Autowired
	private QAWriterService writerService;
	
//	@RequestMapping("/QnA/q&a")
//	public String insertForm(){
//		
//		return "QnA/q&a";
//	}
	
	@RequestMapping("/product/qna_insert")
	public ModelAndView insert(HttpServletRequest request,
			@ModelAttribute QAWriterDto dto){
		System.out.println("test");
		writerService.insert(dto);
		ModelAndView mView=new ModelAndView();
		mView.addObject("msg", dto.getWriterWriter()+" 회원님 QA가 저장되었습니다..");
		mView.addObject("redirectUri", request.getContextPath());
		mView.setViewName("users/alert");
		return mView;
	}
	
}
