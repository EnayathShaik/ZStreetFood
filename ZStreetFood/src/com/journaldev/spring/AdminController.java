package com.journaldev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.journaldev.spring.service.AdminService;

@Controller
public class AdminController {
private AdminService adminService;
	
	@Autowired(required=true)
	@Qualifier(value="adminService")
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
}
