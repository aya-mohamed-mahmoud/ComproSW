package miu.edu.comproTM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import miu.edu.comproTM.model.Student;
import miu.edu.comproTM.model.TMRecord;
import miu.edu.comproTM.service.TmInstructorServiceImp;

public class TmInstructorController {
	@Autowired
    private TmInstructorServiceImp tmInstructorServiceImp;
	
	@GetMapping("/ALLStudent")
    public List<Student> viewAllStudents() {
		List<Student> st1= tmInstructorServiceImp.viewAllStudents();
		return st1;
    }
	
 }
