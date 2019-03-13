package org.spring.service.member;

import java.util.List;

import org.spring.model.member.dto.MemberDTO;

public interface MemberService {
	
	List<MemberDTO> memberList();
}
