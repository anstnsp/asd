package test.gura.computer.qna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dao.QAAnswerDao;
import test.gura.computer.qna.dto.QAAnswerDto;


@Component
public class QAAnswerServiceImpl implements QAAnswerService{

	@Autowired
	private QAAnswerDao qaanswerDao;
	
	
	@Override
	public void insert(QAAnswerDto dto) {
	
		qaanswerDao.insert(dto);
		
	}

	@Override
	public void update(QAAnswerDto dto) {
		qaanswerDao.update(dto);
		
	}

	@Override
	public void delete(int num) {
		qaanswerDao.delete(num);
		
	}

	@Override
	public List<QAAnswerDto> getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QAAnswerDto> getList() {
		return qaanswerDao.getList();
	}

}
