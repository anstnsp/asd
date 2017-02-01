package test.gura.computer.qna.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dto.QAAnswerDto;


public interface QAAnswerService {

	public void insert(QAAnswerDto dto);
	public void update(QAAnswerDto dto);
	public void delete(int num);
	public List<QAAnswerDto> getData(int num);
	public List<QAAnswerDto> getList();
}
