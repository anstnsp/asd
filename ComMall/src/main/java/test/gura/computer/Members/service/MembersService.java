package test.gura.computer.Members.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import test.gura.computer.Members.dto.MembersDto;

public interface MembersService {
	
	public int insert(MembersDto dto);
	// 회원정보를 삭제하기
	public void delete(String id);
	// 회원정보 수정하기
	public int update(MembersDto dto);

	// 아이디 중복 체크
	public boolean checkedId(String id);
	// 한명의 회원정보 출력하기
	public MembersDto getData(String id);
	// 로그인 체크
	public boolean isValid(MembersDto dto);
}
