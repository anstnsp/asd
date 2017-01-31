package test.gura.computer.qna.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.gura.computer.qna.dto.QAAnswerDto;

@Repository
public class QAAnswerDaoImpl implements QAAnswerDao{

	@Autowired
	private SqlSession session;
	
	
	@Override
	public void insert(QAAnswerDto dto) {
	
		session.insert("answer.insert", dto);
		
	}

	@Override
	public void update(QAAnswerDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public QAAnswerDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QAAnswerDto> getList() {
		// TODO Auto-generated method stub
		return null;
	}


}
