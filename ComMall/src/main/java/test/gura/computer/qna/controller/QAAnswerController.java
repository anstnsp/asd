package test.gura.computer.qna.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
