package com.naver.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_naverlogin")
public class User {
	@Id
	@Column(name = "user_default_id")
	private String id;
	@Column(name = "naverlogin_name")
	private String name;
	@Column(name =  "user_default_password")
	private String password;
	@Column(name = "naverlogin_email")
	private String email;

}
