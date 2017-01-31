package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;

public class AdminDAOImpl implements AdminDAO {

private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public List<Object> listRecord() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
