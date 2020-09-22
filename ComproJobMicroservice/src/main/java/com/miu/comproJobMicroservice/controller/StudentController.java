package com.miu.comproJobMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.comproJobMicroservice.model.Student;
import com.miu.comproJobMicroservice.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/{id}")
	public Student getStudentByJobId(@PathVariable int id) {
		return studentService.getStudentByJobId(id);

	}

}
