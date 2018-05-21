package com.jtorol.midas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtorol.midas.dao.UserDAO;
import com.jtorol.midas.domain.UserVO;

@RestController
public class UserController {
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("/add")
	public UserVO addUser(UserVO userVO) {
		UserVO userData = userDAO.save(userVO);
		return userData;
	}
	
	@RequestMapping("/list")
	public List<UserVO> list(Model model) {
		List<UserVO> userList = userDAO.findAll();
		return userList;
	}
	
	@RequestMapping("/")
	public String index() {
		return "hello world!";
	}
}
