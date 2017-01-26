package test.gura.computer.product.dao;

import java.util.List;

import test.gura.computer.product.dto.ProductDto;

public interface ProductDao {
	 
	   public void insert(ProductDto dto);
	   public void delete(int num);
	   public void update(ProductDto dto);
	   public ProductDto getData(int num);
	   public List<ProductDto> getList(ProductDto dto);
	   public int getCount();
	   public void increaseViewCount(int num);
	   public List<ProductDto> getRankedViewCount();
}
