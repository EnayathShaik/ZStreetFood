package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.hb.model.FUser;

public interface UserService {
	//Users
			public void addUser(FUser p);
			public void updateUser(FUser p);
			public List<FUser> listUsers();
			public FUser getUsereById(int id);
			public void removeUser(int id);

}
