package com.naver.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.login.model.User;
import com.naver.login.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;
	
	@Override
	public void insert(User user) {
		repo.save(user);
		
	}

}
