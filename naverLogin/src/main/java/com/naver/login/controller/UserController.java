package com.naver.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.login.model.User;
import com.naver.login.service.UserService;

@Controller
@CrossOrigin
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping(value = "/naver.do")
	public void insert(User user) {
		service.insert(user);
	}
}
