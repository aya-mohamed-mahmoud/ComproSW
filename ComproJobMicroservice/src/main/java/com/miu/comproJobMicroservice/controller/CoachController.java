package com.miu.comproJobMicroservice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.comproJobMicroservice.model.Coach;
import com.miu.comproJobMicroservice.model.Job;
import com.miu.comproJobMicroservice.model.Student;
import com.miu.comproJobMicroservice.repository.CoachRepository;
import com.miu.comproJobMicroservice.repository.JobRepository;
import com.miu.comproJobMicroservice.repository.StudentRepository;
import com.miu.comproJobMicroservice.service.CoachService;

@RestController
@RequestMapping("/coach")
public class CoachController {

	@Autowired
	private CoachService coachService;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CoachRepository coachRepository;

	@Autowired
	JobRepository jobRepository;

	// done
	@GetMapping("/students/{coachId}")
	public Collection<Student> getAllStudents(@PathVariable int coachId) {
		System.out.println("+++ " + coachId);
		Coach coach = null;
		if (coachRepository.findById(coachId).isPresent()) {
			coach = coachRepository.findById(coachId).get();
			return coach.getStudents();
		}
		return null;
	}

	// done
	@PatchMapping("/assign/{stuId}/{coachId}")
	public ResponseEntity<String> assignStudent(@PathVariable String stuId, @PathVariable int coachId) {
		System.out.println("...assignStudent...");
		Coach coach = coachRepository.findById(coachId).get();
		Student student = studentRepository.findStudentByStuId(stuId);
		coachService.assignStudent(student, coach);
		System.out.println("+++++ " + coach.getStudents());
		return new ResponseEntity<String>("student id " + stuId + " assigned successfully to coach id " + coachId,
				HttpStatus.OK);
	}

	// add cources in db and test again
	@PatchMapping("/allow/{stuId}/{coachId}")
	public boolean allowStudentToStartJobSearch(@PathVariable String stuId, @PathVariable int coachId) {
		System.out.println("...allowStudentToStartJobSearch...");
		Coach coach = null;
		if (coachRepository.findById(coachId).isPresent()) {
			coach = coachRepository.findById(coachId).get();
		}
		Student student = studentRepository.findStudentByStuId(stuId);
		return coachService.allowStudentToStartJobSearch(student, coach);
	}

	// done
	@PostMapping("/report/jobsearch/{studentId}/{coachId}")
	public ResponseEntity<String> createJobSearchReport(@PathVariable String studentId, @PathVariable int coachId,
			@RequestBody String description) {
		coachService.createJobSearchReport(studentId, coachId, description);
		return new ResponseEntity<String>(
				"student id " + studentId + " create job search report successfully by " + coachId, HttpStatus.OK);
	}

	@PostMapping("/report/cpt/{studentId}/{jobId}")
	public ResponseEntity<String> createCPTReport(@PathVariable String studentId, @PathVariable int jobId,
			@RequestBody String description) {
		Job job = jobRepository.findById(jobId).get();
		coachService.createCPTReport(studentId, job, description);
		return new ResponseEntity<String>("student id " + studentId + " create job search report successfully by ",
				HttpStatus.OK);
	}

	@GetMapping("/")
	public String test() {
		return "working...";
	}

}
