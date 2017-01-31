package test.gura.computer.qna.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dto.QAWriterDto;

public interface QAWriterService {
	public void insert(QAWriterDto dto);
	public List<QAWriterDto> getdata(int num);
	public List<QAWriterDto> getlist();
	public void delete(int num);
	public void update(QAWriterDto dto);
}
