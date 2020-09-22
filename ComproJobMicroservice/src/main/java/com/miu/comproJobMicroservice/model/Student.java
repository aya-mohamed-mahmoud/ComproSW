package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String studentId;

	private LocalDate enrollmentDate;

	private LocalDate graduationDate;
	
	private Double GPA;
	
	@Embedded
	private Address address;

	@OneToOne
	@JoinColumn(name = "job_id")
	private Job job;

	@ManyToMany
	private List<Course> courses = new ArrayList<>();

	@OneToMany(mappedBy = "student")
	private Collection<JobSearchReport> jobSearchReport;
	
	@ManyToOne
	private Department sdepartment;

	public Student() {
	}

	public Student(int id, String name, String studentId, LocalDate enrollmentDate, LocalDate graduationDate, double GPA,
			Address address) {
		this.id = id;
		this.name = name;
		this.studentId = studentId;
		this.enrollmentDate = enrollmentDate;
		this.graduationDate = graduationDate;
		this.GPA = GPA;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Collection<JobSearchReport> getJobSearchReport() {
		return jobSearchReport;
	}

	public void setJobSearchReport(Collection<JobSearchReport> jobSearchReport) {
		this.jobSearchReport = jobSearchReport;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public LocalDate getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}

	public Department getSdepartment() {
		return sdepartment;
	}

	public void setSdepartment(Department sdepartment) {
		this.sdepartment = sdepartment;
	}

	
}
