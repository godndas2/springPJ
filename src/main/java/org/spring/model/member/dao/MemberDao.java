package org.spring.model.member.dao;

import java.util.List;

import org.spring.model.member.dto.MemberDTO;

public interface MemberDao {

	
	List<MemberDTO> memberList();

}
