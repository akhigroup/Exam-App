package com.journaldev.spring.service;

import com.journaldev.spring.model.Result;
import com.journaldev.spring.model.Stat;

public interface ResultService {

	public String addResult(Result ques);
	public void updateResult(Result ques);
	public Result getResultById(int studentID,int questionID);
	public void removeResult(int studentID,int questionID);
	public Stat compileGenResult(Result r);
	
}
