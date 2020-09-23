package com.miu.comproJobMicroservice.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue
	private int id;
	private String departmentName;
	
	@OneToMany(mappedBy = "sdepartment")
	private Collection<Student> student;
	
	@OneToMany(mappedBy = "cdepartment")
	private Collection<Course>cources;
	
	@OneToMany(mappedBy = "fdepartment")
	private Collection<Faculty> facultyList;
	
	public Department(){}

	public Collection<Student> getStudent() {
		return student;
	}

	public void setStudent(Collection<Student> student) {
		this.student = student;
	}

	public Collection<Course> getCources() {
		return cources;
	}

	public void setCources(Collection<Course> cources) {
		this.cources = cources;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Collection<Faculty> getFacultyList() {
		return facultyList;
	}

	public void setFacultyList(Collection<Faculty> facultyList) {
		this.facultyList = facultyList;
	}
	

}
