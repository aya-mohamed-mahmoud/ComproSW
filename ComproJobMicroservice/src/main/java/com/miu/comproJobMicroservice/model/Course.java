package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String building;
	private int roomNumber;

	private LocalDate startDate;

	private LocalDate endDate;

	@ManyToMany(mappedBy = "courses", cascade = CascadeType.PERSIST)
	private List<Student> students = new ArrayList<>();

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Faculty faculty = new Faculty();

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Department cdepartment;

	public Course() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Department getCdepartment() {
		return cdepartment;
	}

	public void setCdepartment(Department cdepartment) {
		this.cdepartment = cdepartment;
	}

}
