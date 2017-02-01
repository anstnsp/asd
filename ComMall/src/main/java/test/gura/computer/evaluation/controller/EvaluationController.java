package test.gura.computer.evaluation.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import test.gura.computer.evaluation.dto.EvaluationDto;
import test.gura.computer.evaluation.service.EvaluationService;

@Controller
public class EvaluationController {
	@Autowired
	EvaluationService service;

	@RequestMapping("/product/insert")
	public String Insert(@ModelAttribute EvaluationDto dto, HttpSession session) {
		String id = (String) session.getAttribute("id");
		
		dto.setEvaWriter(id);
		service.insert(dto);

		return "redirect:/product/product_info.do?productNum="+dto.getProductNum();	
	}
}
