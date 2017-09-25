package com.journaldev.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.model.Course;
import com.journaldev.spring.model.QuestionPool;
import com.journaldev.spring.model.QuestionProp;

public interface QuestionPoolService {

	
	public List<QuestionPool> getQuestionPools();
	public void addQuestionPool(QuestionPool qp);
	public QuestionPool getPoolById(int id);
	public void addQuestionToPool(int poolID, QuestionProp qp);
	public QuestionProp getQuestionPropById(int qp_id);
	public void editQuestionInPool(int poolID, QuestionProp qp);
	
}
