package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.hb.model.FUser;

public interface UserDAO {
		//Users
		public void addUser(FUser p);
		public void updateUser(FUser p);
		public List<FUser> listUsers();
		public FUser getUsereById(int id);
		public void removeUser(int id);
}
