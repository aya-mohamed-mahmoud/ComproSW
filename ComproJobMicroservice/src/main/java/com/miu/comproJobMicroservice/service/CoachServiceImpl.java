package com.miu.comproJobMicroservice.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.comproJobMicroservice.model.CPTReport;
import com.miu.comproJobMicroservice.model.Coach;
import com.miu.comproJobMicroservice.model.Job;
import com.miu.comproJobMicroservice.model.JobSearchReport;
import com.miu.comproJobMicroservice.model.Student;
import com.miu.comproJobMicroservice.repository.CPTReportRepository;
import com.miu.comproJobMicroservice.repository.CoachRepository;
import com.miu.comproJobMicroservice.repository.JobSearchRepository;
import com.miu.comproJobMicroservice.repository.StudentRepository;

@Service
public class CoachServiceImpl implements CoachService {

	@Autowired
	CoachRepository coachRepository;

	@Autowired
	StudentRepository studnetRepository;

	@Autowired
	JobSearchRepository jobSearchRepository;

	@Autowired
	CPTReportRepository cptReportRepository;

	@Override
	public JobSearchReport createJobSearchReport(String studentId, int coachId, String description) {
		System.out.println("createJobSearchReport...");
		JobSearchReport report = new JobSearchReport(LocalDate.now(), description);
		Student student = studnetRepository.findStudentByStuId(studentId);
		report.setStudent(student);
		jobSearchRepository.save(report);
		return report;
	}

	@Override
	public CPTReport createCPTReport(String studentId, Job job, String description) {
		System.out.println("createCPTReport...");
		Student student = studnetRepository.findStudentByStuId(studentId);
		CPTReport cptReport = new CPTReport(student, job, description, LocalDate.now());
		cptReportRepository.save(cptReport);
		return cptReport;
	}

	@Override
	public boolean allowStudentToStartJobSearch(Student student, Coach coach) {
		if (student.getCourses().size() > 5) {
			student.setInJobSerach(true);
			coach.addStudent(student);
			coachRepository.save(coach);
			return true;
		}
		return false;
	}

	@Override
	public void assignStudent(Student student, Coach coach) {
		if (!coach.getStudents().contains(student)) {
			coach.addStudent(student);
			coachRepository.save(coach);
		}
	}

	@Override
	public Collection<Student> getAllStudents(Coach coach) {
		List<Coach> coaches = coachRepository.findAll();
		if (coaches.contains(coach)) {
			return coach.getStudents();
		}
		return null;
	}

}
