package org.spring.service.member;

import java.util.List;

import org.spring.model.member.dao.MemberDao;
import org.spring.model.member.dto.MemberDTO;
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

}
