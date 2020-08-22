package com.springbook.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 insertBoard() 실행");
		System.out.println("출력 : " + vo.getTitle() + vo.getWriter() + vo.getContent());
		mybatis.insert("BoardDAO.insertBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 updateBoard() 실행");
		mybatis.update("BoardDAO.updateBoard", vo);
	}

	public void deleteBoard(BoardVO vo) {

		System.out.println("===> Mybatis로 deleteBoard() 실행");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 getBoard() 실행");
		mybatis.update("BoardDAO.cntPlus", vo);
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis로 getBoardList() 실행");
		if (vo.getSearchCondition().equals("TITLE")) {
			return mybatis.selectList("BoardDAO.getBoardList_T", vo);
		} else if (vo.getSearchCondition().equals("CONTENT")) {
			return mybatis.selectList("BoardDAO.getBoardList_C", vo);
		}
		return null;
	}
}