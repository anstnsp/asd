package test.gura.computer.product.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import test.gura.computer.product.dto.ProductDto;

public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(ProductDto dto) {
		session.insert("product.insert", dto);
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProductDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductDto getData(int num) {
		ProductDto dto = session.selectOne("product.getData", num);
		return dto;
	}

	@Override
	public List<ProductDto> getList(ProductDto dto) {
		List<ProductDto> list=null;
		
			list=session.selectList("product.getList", dto);
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void increaseViewCount(int num) {
		session.update("product.increaseViewCount", num);
		
	}

	@Override
	public List<ProductDto> getRankedViewCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
