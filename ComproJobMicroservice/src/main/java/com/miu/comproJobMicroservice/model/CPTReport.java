package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class CPTReport {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate submittedDate;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Job studentJob;

	@Column(name = "Report", length = 150)
	private String description;

	public CPTReport() {

	}

	public CPTReport(Student student, Job job, String description, LocalDate submittedDate) {
		this.studentJob = job;
		this.studentJob.setStudent(student);
		this.description = description;
		this.submittedDate = submittedDate;
	}

	public LocalDate getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDate submittedDate) {
		this.submittedDate = submittedDate;
	}

	public Job getStudentJob() {
		return studentJob;
	}

	public void setStudentJob(Job studentJob) {
		this.studentJob = studentJob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
