package org.spring.pj.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.pj.model.member.dto.MemberDTO;
import org.spring.pj.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value = "member/insert", method = RequestMethod.GET)
	public String memberInsertForm(){
		return "member/insert";
	}
	
	@RequestMapping(value = "member/insert", method = RequestMethod.POST)
	public String memberInsert(@ModelAttribute MemberDTO dto) {
		memberService.insertMember(dto);
		return "redirect:/member/list";
	}
	
	@RequestMapping("member/delete")
	public String deleteMember(@RequestParam String userid) {
		memberService.deleteMember(userid);
		return "redirect:/member/list";
	}
	
	@RequestMapping("member/read")
	public String memberRead(@RequestParam String userid, Model model) {
		model.addAttribute("read", memberService.readMember(userid));
		return "member/read";
	}
}
