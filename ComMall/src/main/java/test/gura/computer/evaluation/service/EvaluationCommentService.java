package test.gura.computer.evaluation.service;

import java.util.List;

import test.gura.computer.evaluation.dto.EvaluationCommentDto;

public interface EvaluationCommentService {

	public void insert(EvaluationCommentDto dto);
	public List<EvaluationCommentDto> getList(int ref_group);
	public int getSequence();
	public int getSortSequence();
}
