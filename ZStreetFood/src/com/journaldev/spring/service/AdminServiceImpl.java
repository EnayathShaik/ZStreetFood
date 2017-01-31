package com.journaldev.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.AdminDAO;

public class AdminServiceImpl implements AdminService {
	private AdminDAO adminDAO;
	
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	@Transactional
	public List<Object> listRecord() {
		// TODO Auto-generated method stub
		return this.adminDAO.listRecord();
	}
}
