package test.gura.computer.qna.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;
import test.gura.computer.qna.dto.QAWriterDto;

@Repository
public class QAWriterDaoImpl implements QAWriterDao{
	
	@Autowired // 의존객체를 주입 받기 위한 어노 테이션 
	private SqlSession session;
	
	@Override
	public void insert(QAWriterDto dto) {
		session.insert("writer.insert",dto);
		
	}

	@Override
	public QAWriterDto getdate(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QAWriterDto> getlist() {
		List<QAWriterDto> list=session.selectList("writer.getlist");
		return list;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(QAWriterDto dto) {
		// TODO Auto-generated method stub
		
	}

}
