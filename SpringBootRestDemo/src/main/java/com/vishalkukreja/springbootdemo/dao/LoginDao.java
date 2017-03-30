package com.vishalkukreja.springbootdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vishalkukreja.springbootdemo.domain.Login;

@Repository
public class LoginDao {
	@Autowired
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public Login getLoginDetails(Login loginInput) {
		Login loginOut = null;
		List<Login> resultList = entityManager
				.createQuery(
						"from Login where userName=:username and password=:pass")
				.setParameter("username", loginInput.getUserName())
				.setParameter("pass", loginInput.getPassword()).getResultList();
		if (!resultList.isEmpty()) {
			loginOut = resultList.get(0);
		}
		return loginOut;
	}
}
