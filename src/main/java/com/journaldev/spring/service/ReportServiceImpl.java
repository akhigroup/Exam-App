package com.journaldev.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.journaldev.spring.dao.QuestionDAO;
import com.journaldev.spring.dao.ResultDAO;
import com.journaldev.spring.model.DisplayResult;
import com.journaldev.spring.model.Question;
import com.journaldev.spring.model.Result;

@Service
public class ReportServiceImpl implements ReportService {
	
	private QuestionDAO questionDAO;
	private ResultDAO resultDAO;
	
	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}
	
	public void setResultDAO(ResultDAO resultDAO) {
		this.resultDAO = resultDAO;
	}

	@Override
	@Transactional
	public List<DisplayResult> getResultsforExam(int courseID, int examID) {
		
		List<Result> results = resultDAO.getResultsForExam(examID);
		
		List<DisplayResult> dResults = new ArrayList<DisplayResult>();
		
		for(Result r:results){
			Question q = questionDAO.getQuestionById(r.getId().getQuestionID());
			dResults.add(new DisplayResult(q,r));
		}
		
		return dResults;
	}
}
