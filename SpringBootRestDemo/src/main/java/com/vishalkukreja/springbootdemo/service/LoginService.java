package com.vishalkukreja.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishalkukreja.springbootdemo.dao.LoginDao;
import com.vishalkukreja.springbootdemo.domain.Login;

@Service
public class LoginService {

	@Autowired
	LoginDao dao;

	public Login checkLoginDetails(Login loginInput) {
		return dao.getLoginDetails(loginInput);
	}
}
