package org.spring.pj.service.board;

import java.util.List;

import org.spring.pj.model.board.dao.BoardDAO;
import org.spring.pj.model.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		return boardDao.boardList();
	}

	@Override
	public void boardInsert(BoardDTO dto) {
		boardDao.boardInsert(dto);
	}

	@Override
	public BoardDTO boardDetail(String bno) {
		// TODO Auto-generated method stub
		return boardDao.boardDetail(bno);
	}

	@Override
	public void boardDelete(String bno) {
		// TODO Auto-generated method stub
		boardDao.boardDelete(bno);
	}

	@Override
	public void boardUpdate(BoardDTO dto) {
		// TODO Auto-generated method stub
		boardDao.boardUpdate(dto);
	}

	@Override
	public void viewCnt(String bno) {
		// TODO Auto-generated method stub
		boardDao.viewCnt(bno);
	}

}
