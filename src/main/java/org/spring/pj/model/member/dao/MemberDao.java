package org.spring.pj.model.member.dao;

import java.util.List;

import org.spring.pj.model.member.dto.MemberDTO;

public interface MemberDao {

	List<MemberDTO> memberList();
	void insertMember(MemberDTO dto);
	void deleteMember (String userid);
	MemberDTO readMember(String userid);
	void updateMember (MemberDTO dto);
}
