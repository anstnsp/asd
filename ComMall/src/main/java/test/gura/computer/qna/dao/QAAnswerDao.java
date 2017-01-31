package test.gura.computer.qna.dao;


import java.util.List;

import test.gura.computer.qna.dto.QAAnswerDto;

public interface QAAnswerDao {

	public void insert(QAAnswerDto dto);
	public void update(QAAnswerDto dto);
	public void delete(int num);
	public QAAnswerDto getData(int num);
	public List<QAAnswerDto> getList();
	
}
