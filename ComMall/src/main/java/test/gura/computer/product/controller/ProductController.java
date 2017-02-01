
package test.gura.computer.product.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.evaluation.service.EvaluationCommentService;
import test.gura.computer.evaluation.service.EvaluationService;
import test.gura.computer.product.dto.ProductDto;
import test.gura.computer.product.service.ProductService;
import test.gura.computer.qna.service.QAAnswerService;
import test.gura.computer.qna.service.QAWriterService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private QAWriterService qaWriterService;
	@Autowired
	private EvaluationService evalService;
	@Autowired
	private EvaluationCommentService commentService;
	@Autowired
	private QAAnswerService qaAnswerService;
	
	@RequestMapping("/product/list")
	public ModelAndView list(HttpServletRequest request,
			@RequestParam(defaultValue="1") int pageNum){
		
		ModelAndView mView = productService.getList(request, pageNum);
		mView.setViewName("product/product_list");
		return mView;
	}
	
	@RequestMapping("/product/private/insertform")
	public void insertForm(){
		
	}
	@RequestMapping("/product/private/insert")
	public String insert(HttpServletRequest request,ProductDto dto){
		
	      productService.insert(request,dto);
	     
		return "redirect:../list.do";
	}
	@RequestMapping("/product/product_info")
	public ModelAndView productInfo(HttpServletRequest request){
		int num=Integer.parseInt(request.getParameter("productNum"));
		productService.increaseViewCount(num);
		ModelAndView mView=  productService.getData(num);
		mView.addObject("list", qaWriterService.getlist());
		mView.addObject("list2",evalService.getList(num));
		mView.addObject("list3",qaAnswerService.getList());
		mView.addObject("commentList",commentService.getList(num));
		mView.setViewName("product/product_info");
		return mView;
	}
	@RequestMapping("/users/product/list")
	public ModelAndView list1(HttpServletRequest request,
			@RequestParam(defaultValue="1") int pageNum){
		
		ModelAndView mView = productService.getList(request, pageNum);
		mView.setViewName("product/product_list");
		return mView;
	}
	

}

