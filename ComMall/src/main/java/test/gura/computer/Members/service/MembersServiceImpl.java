package test.gura.computer.Members.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.Members.dao.MembersDao;
import test.gura.computer.Members.dto.MembersDto;

@Service
public class MembersServiceImpl implements MembersService {
	private PasswordEncoder pEncoder = new BCryptPasswordEncoder();
	@Autowired
	private MembersDao dao;
	@Override
	public int insert(MembersDto dto) {
		String pwd = pEncoder.encode(dto.getMemberPwd());
		dto.setMemberPwd(pwd);
		return dao.insert(dto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public int update(MembersDto dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public boolean checkedId(String id) {
		// TODO Auto-generated method stub
		return dao.checkedId(id);
	}

	@Override
	public MembersDto getData(String id) {
		// TODO Auto-generated method stub
		return dao.getData(id);
	}

	@Override
	public boolean isValid(MembersDto dto) {
		// TODO Auto-generated method stub
		String pwd = dao.isValid(dto.getMemberId());
		
		return pEncoder.matches(dto.getMemberPwd(),pwd);
	}

}
