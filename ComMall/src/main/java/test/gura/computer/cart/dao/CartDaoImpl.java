package test.gura.computer.cart.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.gura.computer.cart.dto.CartDto;

@Repository
public class CartDaoImpl implements CartDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public void cartAdd(CartDto dto) {
		
		session.insert("cart.insert", dto);
		
	}

	@Override
	public List<CartDto> cartList(String memberId) {
		List<CartDto> list =session.selectList("cart.getList", memberId);
		return list;
	}

	@Override
	public void cartDelete(int productNum) {
		session.delete("cart.delete", productNum);
		
	}

}
