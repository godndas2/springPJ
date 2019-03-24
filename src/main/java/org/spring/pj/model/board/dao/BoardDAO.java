package org.spring.pj.model.board.dao;

import java.util.List;

import org.spring.pj.model.board.dto.BoardDTO;

public interface BoardDAO {
	
	List<BoardDTO> boardList();
	void boardInsert(BoardDTO dto);
	BoardDTO boardDetail(String bno);
	void boardDelete(String bno);
	void boardUpdate(BoardDTO dto);
	void viewCnt(String bno);
}
