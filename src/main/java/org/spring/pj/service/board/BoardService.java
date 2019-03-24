package org.spring.pj.service.board;

import java.util.List;

import org.spring.pj.model.board.dto.BoardDTO;

public interface BoardService {

	List<BoardDTO> boardList();
	void boardInsert(BoardDTO dto);
}