package edu.miu.cs544.eaproject.team5.studentmicroservice.serviceImpl;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Course;
import edu.miu.cs544.eaproject.team5.studentmicroservice.repository.CourseRepository;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImp implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course getCourseByName(String name) {
		
		return courseRepository.getCourseByName(name);
		
		
	}

	@Override
	public List<Course> getAllCourse() {
		
		return courseRepository.findAll();
	}

	@Override
	public Course getCurseById(int id) {
		
		 if(courseRepository.findById(id).isPresent())
			 return courseRepository.findById(id).get();
		 return null;
	}
}
