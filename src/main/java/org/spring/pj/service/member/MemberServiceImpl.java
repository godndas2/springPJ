package org.spring.pj.service.member;

import java.util.List;

import org.spring.pj.model.member.dao.MemberDao;
import org.spring.pj.model.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;

	@Override
	public List<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		return memberDao.memberList();
	}

	@Override
	public void insertMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		memberDao.insertMember(dto);
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub
		memberDao.deleteMember(userid);
	}

	@Override
	public MemberDTO readMember(String userid) {
		// TODO Auto-generated method stub
		return memberDao.readMember(userid);
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		memberDao.updateMember(dto);
	}


}
