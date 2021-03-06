package com.springbook.view.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/insertUser.do", method = RequestMethod.POST)
	public String insertUser(UserVO vo) {
		try {
		userService.insertUser(vo);
		return "login.jsp";
		}catch (Exception e) {
			return "insertUserError.jsp" ;
		}
	}

	
}
