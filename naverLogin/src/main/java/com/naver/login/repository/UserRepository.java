package com.naver.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naver.login.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
	User save(User user);
	
}
