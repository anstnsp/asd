package test.gura.computer.product.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.product.dto.ProductDto;

public interface ProductService {
	   public void insert(HttpServletRequest request,ProductDto dto);
	   public void delete(int num);
	   public void update(ProductDto dto);
	   public ModelAndView getData(int num);
	   public ModelAndView getList(HttpServletRequest request, int pageNum);
	   public int getCount();
	   public void increaseViewCount(int num);
	   public List<ProductDto> getRankedViewCount();
}
