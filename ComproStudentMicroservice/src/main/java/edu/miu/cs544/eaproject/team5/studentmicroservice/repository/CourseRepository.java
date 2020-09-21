package edu.miu.cs544.eaproject.team5.studentmicroservice.repository;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
	public Course getCourseByName(String name);
}
