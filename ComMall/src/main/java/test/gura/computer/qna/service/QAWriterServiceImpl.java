package test.gura.computer.qna.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.qna.dao.QAWriterDao;
import test.gura.computer.qna.dto.QAWriterDto;

@Component
public class QAWriterServiceImpl implements QAWriterService {
	// 비밀번호 인코더 객체
	private PasswordEncoder pEncoder = new BCryptPasswordEncoder();

	@Autowired
	private QAWriterDao writerDao;

	@Override
	public void insert(QAWriterDto dto) {
		writerDao.insert(dto);

	}

	@Override
	public List<QAWriterDto> getdata(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QAWriterDto> getlist() {
		return writerDao.getlist();
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
