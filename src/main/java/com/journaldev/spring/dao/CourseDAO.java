package com.journaldev.spring.dao;
import java.util.List;

import com.journaldev.spring.model.Course;

public interface CourseDAO {

	public void addCourse(Course p);
	public void updateCourse(Course p);
	public List<Course> listCourses();
	public Course getCourseById(int id);
	public void removeCourse(int id);
	public List<Course> listMyCourses(String userName);
}