package edu.miu.cs544.eaproject.team5.studentmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Faculty;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.FaculityService;

@RestController
@RequestMapping("/faculities")
public class FaculityController {
	@Autowired
    private FaculityService faculityService;

    @GetMapping("/")
    public List<Faculty> getAllCourse() {
        return faculityService.getAllFaculity();
    }

    @GetMapping("/{id}")
    public Faculty getAllFaculityById(@PathVariable  int id) {
        return faculityService.getFaculityById(id);
    }

    @GetMapping("/byName")
    public Faculty getFaculityByName(@RequestParam  String name) {
        return faculityService.getFaculityByName(name);
    }
	
}
