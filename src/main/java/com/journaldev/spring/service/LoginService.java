package com.journaldev.spring.service;
import java.sql.SQLException;

import com.journaldev.spring.model.User;

public interface LoginService {

	public User isValidUser(String username, String password) throws SQLException;
	
}
