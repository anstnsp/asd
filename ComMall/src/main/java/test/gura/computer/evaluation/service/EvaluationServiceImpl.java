package test.gura.computer.evaluation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.gura.computer.evaluation.dao.EvaluationDao;
import test.gura.computer.evaluation.dto.EvaluationDto;

@Service
public class EvaluationServiceImpl implements EvaluationService {

	@Autowired
	EvaluationDao dao;
	@Override
	public void insert(EvaluationDto dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);
	}

	@Override
	public List<EvaluationDto> getList(int productNum) {
		// TODO Auto-generated method stub
		return dao.getList(productNum);
	}
}