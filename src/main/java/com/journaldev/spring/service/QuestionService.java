package com.journaldev.spring.service;

import com.journaldev.spring.model.Question;

public interface QuestionService {

	public void addQuestion(Question ques);
	public void updateQuestion(Question ques);
	
	//public List<Question> listQuestions();
	
	public Question getQuestionById(int id);
	public void removeQuestion(int id);
	
}
