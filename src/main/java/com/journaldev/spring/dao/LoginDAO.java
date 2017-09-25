package com.journaldev.spring.dao;

import java.sql.SQLException;

import com.journaldev.spring.model.User;

public interface LoginDAO
{
	public User isValidUser(String username, String password) throws SQLException;
}
