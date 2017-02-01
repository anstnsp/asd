package test.gura.computer.evaluation.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.gura.computer.evaluation.dto.EvaluationCommentDto;

@Repository
public class EvaluationCommentDaoImpl implements EvaluationCommentDao {
	@Autowired
	SqlSession session;

	@Override
	public void insert(EvaluationCommentDto dto) {
		// TODO Auto-generated method stub
		session.insert("evaluationComment.insert", dto);
	}

	@Override
	public List<EvaluationCommentDto> getList(int ref_group) {
		// TODO Auto-generated method stub
		return session.selectList("evaluationComment.getList", ref_group);
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return session.selectOne("evaluationComment.getSequence");
	}

	@Override
	public int getSortSequence() {
		// TODO Auto-generated method stub
		return session.selectOne("evaluationComment.getSortSequence");
	}
}
