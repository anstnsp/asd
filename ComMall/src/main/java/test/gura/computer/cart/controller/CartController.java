package test.gura.computer.cart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.cart.dto.CartDto;
import test.gura.computer.cart.service.CartService;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	@RequestMapping("/product/private/cartInsert")
	public String cartInsert(HttpSession session,
			@RequestParam int productNum,Model model
			){
		
		System.out.println("장바구니 인서트");
		String memberId=(String)session.getAttribute("id");
		CartDto dto = new CartDto(productNum,memberId,1);
		cartService.cartAdd(dto);
		return "redirect:/product/private/cartList.do";
		
	}

	@RequestMapping("/product/private/cartList")
	public String cartList(HttpSession session,Model model){
		
		System.out.println("담기냐");
		//세션에 저장된 사용자의 아이디
		String memberId = (String)session.getAttribute("id");
		
		
		List<CartDto> list=cartService.cartList(memberId);
		
		model.addAttribute("list", list);
		return "product/private/cartlist";
		
	}
	
	@RequestMapping("/product/private/cartDelete")
	public String cartDelete(HttpSession session,@RequestParam int productNum){
		
		System.out.println("장바구니 삭제 하는데임");
		String memberId = (String)session.getAttribute("id");
		cartService.cartDelete(productNum);
		
		return "redirect:/product/private/cartList.do";
	}
}
