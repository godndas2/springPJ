
package org.spring.pj.model.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.spring.pj.model.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		sqlSession.insert("member.insertMember", dto);
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub
		sqlSession.delete("member.deleteMember", userid);
	}

	@Override
	public MemberDTO readMember(String userid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.readMember", userid);
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		sqlSession.update("member.updateMember", dto);
	}


}
