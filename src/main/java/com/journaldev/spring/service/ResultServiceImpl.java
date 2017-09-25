package com.journaldev.spring.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.QuestionDAO;
import com.journaldev.spring.dao.ResultDAO;
import com.journaldev.spring.model.Question;
import com.journaldev.spring.model.Result;
import com.journaldev.spring.model.Stat;
import com.journaldev.utility.CompilationUnit;

@Service
public class ResultServiceImpl implements ResultService {
	
	private ResultDAO resultDAO;	
	
	QuestionDAO questionDAO;
	
	public void setResultDAO(ResultDAO resultDAO) {
		this.resultDAO = resultDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}

	@Override
	@Transactional
	public String addResult(Result res) {
		
		String message = null;
				
		Stat compileGenResult = compileGenResult(res);
		
		
		if(compileGenResult.getCompileStatus() == 1){
			res.setResultMessage("Success");
			res.setScore(compileGenResult.getScore());
			
			message = "Success "+ compileGenResult.getScore();
		}else{
			res.setResultMessage(compileGenResult.getErrorMessage());
			message = compileGenResult.getErrorMessage();
		}
		
		this.resultDAO.saveupdateResult(res);
		
		return message;
	}

	@Override
	@Transactional
	public void updateResult(Result ques) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Result getResultById(int studentID, int questionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void removeResult(int studentID, int questionID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Stat compileGenResult(Result res) {
		// Here now compile and Generate the result and send it back to the user.
		
		int quesID = res.getId().getQuestionID();		
		Question q = questionDAO.getQuestionById(quesID);
		Stat stat = null;
		
		String testcase = q.getTestcase();
		String submitCode = res.getSubmitedCode();
		String submitCodeClassName = q.getSubmitCodeClassName();
		
		try {
			
			stat = CompilationUnit.compile(submitCode, testcase, submitCodeClassName);
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stat;
	}
	
}
