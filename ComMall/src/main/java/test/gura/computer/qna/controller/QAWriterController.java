package test.gura.computer.qna.controller;

import java.security.Provider.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public ModelAndView insert(@ModelAttribute QAWriterDto dto,HttpSession session){
		String id = (String) session.getAttribute("id");
		dto.setWriterWriter(id);
		writerService.insert(dto);
		ModelAndView mView=new ModelAndView();
		mView.setViewName("redirect:/product/product_info.do?productNum="+dto.getWriterNum());
		return mView;
	}
	
}
