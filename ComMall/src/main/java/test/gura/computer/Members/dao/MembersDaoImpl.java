package test.gura.computer.Members.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.gura.computer.Members.dto.MembersDto;

@Repository
public class MembersDaoImpl implements MembersDao {
	@Autowired
	private SqlSession session;

	@Override
	public int insert(MembersDto dto) {
		// TODO Auto-generated method stub
		return session.insert("members.insert", dto);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		session.delete("members.delete", id);
	}

	@Override
	public int update(MembersDto dto) {
		// TODO Auto-generated method stub
		return session.update("members.update", dto);
	}


	@Override
	public boolean checkedId(String id) {
		// TODO Auto-generated method stub
		MembersDto dto = null;
		boolean isSuccess = true;
		dto = session.selectOne("members.checkedId", id);
		if (dto != null) {
			isSuccess = false;
		} else {
			isSuccess = true;
		}
		return isSuccess;
	}

	@Override
	public MembersDto getData(String id) {
		// TODO Auto-generated method stub
		return session.selectOne("members.getData",id);
	}

	@Override
	public String isValid(String memberId) {
		// TODO Auto-generated method stub
		return session.selectOne("members.signin",memberId);
	}

}
