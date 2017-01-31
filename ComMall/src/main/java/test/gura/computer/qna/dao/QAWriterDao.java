package test.gura.computer.qna.dao;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dto.QAWriterDto;

public interface QAWriterDao {
	public void insert(QAWriterDto dto);
	public QAWriterDto getdate(int num);
	public List<QAWriterDto> getlist();
	public void delete(int num);
	public void update(QAWriterDto dto);
}
