package test.gura.computer.evaluation.dao;

import java.util.List;

import test.gura.computer.evaluation.dto.EvaluationCommentDto;

public interface EvaluationCommentDao {
	public void insert(EvaluationCommentDto dto);
	public List<EvaluationCommentDto> getList(int ref_group);
	public int getSequence();
	public int getSortSequence();
}	
