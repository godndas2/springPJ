package org.spring.model.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.spring.model.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}

}
