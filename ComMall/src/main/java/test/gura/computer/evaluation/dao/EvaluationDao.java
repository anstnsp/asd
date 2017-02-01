package test.gura.computer.evaluation.dao;

import java.util.List;

import test.gura.computer.evaluation.dto.EvaluationDto;
	
public interface EvaluationDao {
	
	public void insert(EvaluationDto dto);
	public List<EvaluationDto> getList(int productNum);

}
