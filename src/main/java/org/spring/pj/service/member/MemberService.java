package org.spring.pj.service.member;

import java.util.List;

import org.spring.pj.model.member.dto.MemberDTO;

public interface MemberService {
	
	List<MemberDTO> memberList();
	void insertMember(MemberDTO dto);
	void deleteMember (String userid);
	MemberDTO readMember(String userid);
}
