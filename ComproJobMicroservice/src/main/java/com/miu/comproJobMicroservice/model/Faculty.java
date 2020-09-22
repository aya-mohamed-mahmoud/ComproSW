package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Faculty extends Employee {

	private String name;
	private LocalDate hiringDate;
	private int roomNumber;

	@OneToMany(mappedBy = "faculty")
	private List<Course> courses = new ArrayList<>();

	@ManyToOne
	private Department fdepartment;

	@Embedded
	private Address address;

	public Faculty() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Department getFdepartment() {
		return fdepartment;
	}

	public void setFdepartment(Department fdepartment) {
		this.fdepartment = fdepartment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
