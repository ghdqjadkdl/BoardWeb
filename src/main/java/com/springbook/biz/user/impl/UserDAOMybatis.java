package com.springbook.biz.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.user.UserVO;

@Repository
public class UserDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertUser(UserVO vo) {
		System.out.println("===> Mybatis�� insertUser() ��� ó��");
		 mybatis.insert("UserDAO.insertUser", vo);
	}

	
}