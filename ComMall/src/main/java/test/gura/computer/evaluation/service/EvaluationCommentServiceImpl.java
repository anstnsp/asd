package test.gura.computer.evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.gura.computer.evaluation.dao.EvaluationCommentDao;
import test.gura.computer.evaluation.dto.EvaluationCommentDto;

@Service
public class EvaluationCommentServiceImpl implements EvaluationCommentService {
	@Autowired
	EvaluationCommentDao dao;

	@Override
	public void insert(EvaluationCommentDto dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
	}

	@Override
	public List<EvaluationCommentDto> getList(int ref_group) {
		// TODO Auto-generated method stub
		return dao.getList(ref_group);
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return dao.getSequence();
	}

	@Override
	public int getSortSequence() {
		// TODO Auto-generated method stub
		return dao.getSequence();
	}

}
