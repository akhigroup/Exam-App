package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.model.QuestionPool;
import com.journaldev.spring.model.QuestionProp;

public interface QuestionPoolDAO {

	public List<QuestionPool> getQuestionPools();
	public void addQuestionPool(QuestionPool qp);
	public QuestionPool getPoolById(int id);
	public void updateQuestionPool(QuestionPool qp);
	public QuestionProp getQuestionPropById(int qp_id);
	public void updateQuestionProp(QuestionProp prop);
	
}
