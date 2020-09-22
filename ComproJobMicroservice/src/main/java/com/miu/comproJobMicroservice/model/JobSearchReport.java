package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class JobSearchReport {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate submittedDate;

	private String description;
	
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;

	public JobSearchReport() {
	}

	public JobSearchReport(LocalDate submittedDate, String desc) {
		this.submittedDate = submittedDate;
		this.description = desc;
	}

	public LocalDate getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDate submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String desc) {
		this.description = desc;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
