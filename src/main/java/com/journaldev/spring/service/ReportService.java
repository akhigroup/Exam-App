package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.DisplayResult;

public interface ReportService {

	public List<DisplayResult> getResultsforExam(int courseID,int examID);
	
}
