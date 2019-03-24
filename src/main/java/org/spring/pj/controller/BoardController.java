package org.spring.pj.controller;

import java.util.List;

import org.spring.pj.model.board.dto.BoardDTO;
import org.spring.pj.service.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("board/list")
	public String boardList(Model model) {
		List<BoardDTO> list = boardService.boardList();
		model.addAttribute("list",list);
		return "board/boardList";
	}
	
	@RequestMapping(value = "board/insert", method = RequestMethod.GET)
	public String boardInsertForm(){
		return "board/boardInsert";
	}
	
	@RequestMapping(value = "board/insert", method = RequestMethod.POST)
	public String boardInsert (@ModelAttribute BoardDTO dto) {
		boardService.boardInsert(dto);
		return "redirect:/board/list";
	}
}
