package com.journaldev.spring.dao;

import java.util.List;
import java.util.Set;

import com.journaldev.spring.model.Result;
import com.journaldev.spring.model.User;

public interface ResultDAO {

	public void addResult(Result p);
	public void updateResult(Result p);
	public List<Result> listResults();
	public Result getResultById(int id);
	public void removeResult(int id);
	void saveupdateResult(Result p);
	public boolean hasExamStarted(String username, int exam_id);
	public List<Result> getResults(String username, int exam_id);
	public List<Result> getResultsForExam(int examID);
}
