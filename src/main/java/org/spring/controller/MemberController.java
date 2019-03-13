package org.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.model.member.dto.MemberDTO;
import org.spring.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("member/list")
	public String memberList(Model model) {
		
		List<MemberDTO> list = memberService.memberList();
		logger.info(">>>> list >>>> " + list);
		model.addAttribute("list", list);
		
		return "member/memberList";
	}
	
}
