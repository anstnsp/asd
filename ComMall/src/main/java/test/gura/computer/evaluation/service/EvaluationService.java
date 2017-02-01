package test.gura.computer.evaluation.service;

import java.util.List;

import test.gura.computer.evaluation.dto.EvaluationDto;

public interface EvaluationService {

	public void insert(EvaluationDto dto);
	public List<EvaluationDto> getList(int productNum);
	
}
