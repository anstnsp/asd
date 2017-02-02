package test.gura.computer.cart.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.cart.dao.CartDao;
import test.gura.computer.cart.dto.CartDto;


@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cartDao;
	
	@Override
	public void cartAdd(CartDto dto) {
		cartDao.cartAdd(dto);
		
	}

	@Override
	public List<CartDto> cartList(String memberId) {
		List<CartDto> list = cartDao.cartList(memberId);
		
		
		return list;
	}
	

}
