package test.gura.computer.cart.dao;

import java.util.List;

import test.gura.computer.cart.dto.CartDto;

public interface CartDao {
	//장바구니에 추가
	public void cartAdd(CartDto dto);
	public List<CartDto> cartList(String memberId);
	public void cartDelete(int productNum);
}
