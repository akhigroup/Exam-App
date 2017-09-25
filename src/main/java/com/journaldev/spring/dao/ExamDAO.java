package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.model.Exam;
import com.journaldev.spring.model.Question;

public interface ExamDAO {

	public void addExam(Exam p);
	public void updateExam(Exam p);
	public List<Exam> listExams();
	public Exam getExamById(int id);
	public void removeExam(int id);
	public List<Question> listQuestions(int exam_id, int course_id);
	void mergeExam(Exam p);
}
