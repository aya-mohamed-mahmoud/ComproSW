package edu.miu.cs544.eaproject.team5.studentmicroservice.service;

import java.util.List;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Course;

public interface CourseService {



public Course getCourseByName(String name);

public List<Course> getAllCourse();

public Course getCurseById(int id);
	
}
