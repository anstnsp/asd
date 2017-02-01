package test.gura.computer.evaluation.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import test.gura.computer.evaluation.dto.EvaluationCommentDto;
import test.gura.computer.evaluation.service.EvaluationCommentService;

@Controller
public class EvaluationCommentController {
	@Autowired
	EvaluationCommentService service;
	
	@RequestMapping("/product/comment_insert")
	public String Insert(@ModelAttribute EvaluationCommentDto dto, HttpSession session) {
		String id = (String) session.getAttribute("id");
		int comSort_group = service.getSortSequence();
		dto.setComWriter(id);
		dto.setComSort_group(comSort_group);
		if(dto.getComComment_group() == 0)
	    	  dto.setComComment_group(comSort_group);
	      else
	    	  dto.setComComment_group(dto.getComComment_group());
		service.insert(dto);

		return "redirect:/product/product_info.do?productNum="+dto.getComRef_group();	
	}
}
