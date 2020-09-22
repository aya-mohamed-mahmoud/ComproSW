package edu.miu.cs544.eaproject.team5.studentmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Course;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.CourseService;



@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
    private CourseService courseService;

    @GetMapping("/")
    public List<Course> getAllCourse() {
        return courseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public Course getAllCourseById(@PathVariable int id) {
        return courseService.getCurseById(id);
    }

    @GetMapping("/byName")
    public Course getCourseByName(@RequestParam String name) {
        return courseService.getCourseByName(name);
    }
	
}
