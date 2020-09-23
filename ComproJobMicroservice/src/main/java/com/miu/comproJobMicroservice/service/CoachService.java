package com.miu.comproJobMicroservice.service;

import java.util.Collection;

import com.miu.comproJobMicroservice.model.CPTReport;
import com.miu.comproJobMicroservice.model.Coach;
import com.miu.comproJobMicroservice.model.Job;
import com.miu.comproJobMicroservice.model.JobSearchReport;
import com.miu.comproJobMicroservice.model.Student;

public interface CoachService {

	public JobSearchReport createJobSearchReport(String studentId, int coachId, String description);

	public CPTReport createCPTReport(String studentId, Job job, String description);

	public boolean allowStudentToStartJobSearch(Student student, Coach coach);

	public void assignStudent(Student student, Coach coach);

	public Collection<Student> getAllStudents(Coach coach);

}
