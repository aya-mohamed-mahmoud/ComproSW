package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Job {
	@Id
	@GeneratedValue
	private int id;
	private double salary;
	private String title;

	@OneToOne(mappedBy = "job", cascade = CascadeType.PERSIST)
	private Student student;

	@OneToMany(mappedBy = "studentJob", cascade = CascadeType.PERSIST)
	private Collection<CPTReport> cptReport;

	private LocalDate startDate;

	public Job() {
	}

	public Job(double salary, String title) {
		this.salary = salary;
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Collection<CPTReport> getCptReport() {
		return cptReport;
	}

	public void setCptReport(Collection<CPTReport> cptReport) {
		this.cptReport = cptReport;
	}

}
