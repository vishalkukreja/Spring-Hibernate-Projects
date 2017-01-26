package com.vish.springhibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {
	@Autowired
	private SessionFactory sessionFact;
	
	public Session getSession(){
		return sessionFact.getCurrentSession();
	}
	public void persist(Object entity) {
        getSession().persist(entity);
    }
 
    public void delete(Object entity) {
        getSession().delete(entity);
    }	
}
