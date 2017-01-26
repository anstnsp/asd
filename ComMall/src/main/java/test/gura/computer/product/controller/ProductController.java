package test.gura.computer.product.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.product.dto.ProductDto;
import test.gura.computer.product.service.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product/list")
	public ModelAndView list(HttpServletRequest request,
			@RequestParam(defaultValue="1") int pageNum){
		
		ModelAndView mView = productService.getList(request, pageNum);
		mView.setViewName("product/list");
		return mView;
	}
	
	@RequestMapping("/product/private/insertform")
	public void insertForm(){
		
	}
	@RequestMapping("/product/private/insert")
	public String insert(ProductDto dto){
		productService.insert(dto);
		return "product/list";
	}
	@RequestMapping("/product/product_info")
	public ModelAndView productInfo(HttpServletRequest request){
		int num=Integer.parseInt(request.getParameter("productNum"));
		productService.increaseViewCount(num);
		ModelAndView mView=  productService.getData(num);
		mView.setViewName("product/product_info");
		return mView;
	}
	
}
