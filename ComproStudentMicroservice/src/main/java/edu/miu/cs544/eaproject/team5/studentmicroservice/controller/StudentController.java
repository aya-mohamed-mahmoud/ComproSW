package edu.miu.cs544.eaproject.team5.studentmicroservice.controller;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Student;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentes")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getAllStudenById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/byName")
    public Student getStudentByName(@RequestParam String name) {
        return studentService.getStudentByName(name);
    }
}
