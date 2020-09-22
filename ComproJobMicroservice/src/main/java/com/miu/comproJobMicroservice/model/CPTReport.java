package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CptReport")
public class CPTReport {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate submittedDate;

	@ManyToOne
	private Job jobStudent;

	public CPTReport() {

	}

	public LocalDate getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(LocalDate submittedDate) {
		this.submittedDate = submittedDate;
	}

	public Job getJobStudent() {
		return jobStudent;
	}

	public void setJobStudent(Job jobStudent) {
		this.jobStudent = jobStudent;
	}

}
