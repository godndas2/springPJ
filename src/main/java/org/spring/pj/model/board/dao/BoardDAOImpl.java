package org.spring.pj.model.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.spring.pj.model.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

@Autowired
SqlSession sqlsession;
	
	@Override
	public List<BoardDTO> boardList() {
		// TODO Auto-generated method stub
		return sqlsession.selectList("board.boardList");
	}

	@Override
	public void boardInsert(BoardDTO dto) {
		// TODO Auto-generated method stub
		sqlsession.insert("board.boardInsert", dto);
	}

	@Override
	public BoardDTO boardDetail(String bno) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("board.boardDetail", bno );
	}

	@Override
	public void boardDelete(String bno) {
		// TODO Auto-generated method stub
		sqlsession.delete("board.boardDelete", bno);
	}

	@Override
	public void boardUpdate(BoardDTO dto) {
		// TODO Auto-generated method stub
		sqlsession.update("board.boardUpdate", dto);
	}

	@Override
	public void viewCnt(String bno) {
		// TODO Auto-generated method stub
		sqlsession.update("board.viewCnt", bno);
	}

}
