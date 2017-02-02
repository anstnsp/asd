package test.gura.computer.cart.service;

import java.util.List;


import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.cart.dto.CartDto;

public interface CartService {
	public void cartAdd(CartDto dto);
	
	public List<CartDto> cartList(String memberId);
	public void cartDelete(int productNum);
}
