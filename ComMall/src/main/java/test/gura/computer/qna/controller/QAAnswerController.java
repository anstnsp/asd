package test.gura.computer.qna.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dto.QAAnswerDto;
import test.gura.computer.qna.service.QAAnswerService;

@Controller
public class QAAnswerController {

	@Autowired
	private QAAnswerService qaAnswerService;
	
	@RequestMapping("/product/a_insert")
	public String answerInsert(@ModelAttribute QAAnswerDto dto, HttpSession session,@RequestParam int writerNum, @RequestParam int productNum){
		dto.setAnswerWriter((String)session.getAttribute("id"));
		dto.setAnswerRef_num(writerNum);
		qaAnswerService.insert(dto);
		return "redirect:/product/product_info.do?productNum="+productNum;
	}
	@RequestMapping("/product/adelete")
	public String delete(int num, int productNum){
		qaAnswerService.delete(num);
		return "redirect:/product/product_info.do?productNum="+productNum;
	}
	
	@RequestMapping("/product/aupdate")
	public String update(int num, String content, int productNum){
		QAAnswerDto dto = new QAAnswerDto();
		dto.setAnswerRef_num(num);
		dto.setAnswerContent(content);
		qaAnswerService.update(dto);
		return "redirect:/product/product_info.do?productNum="+productNum;
		
	}
}
