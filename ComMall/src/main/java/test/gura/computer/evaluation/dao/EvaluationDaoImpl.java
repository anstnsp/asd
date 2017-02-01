package test.gura.computer.evaluation.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.gura.computer.evaluation.dto.EvaluationDto;
@Repository
public class EvaluationDaoImpl implements EvaluationDao{
	@Autowired
	SqlSession session;
	@Override
	public void insert(EvaluationDto dto) {
		// TODO Auto-generated method stub
		session.insert("evaluation.insert", dto); 
	}

	@Override
	public List<EvaluationDto> getList(int productNum) {
		// TODO Auto-generated method stub
		return session.selectList("evaluation.getList", productNum);
	}
}
