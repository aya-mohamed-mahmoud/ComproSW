package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Coach extends Employee {
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="coach_id")
	private Collection<Student> students;

	public Coach() {
	}
	public Coach(String name, String responsibiltyDesc, String officeID, LocalDate hiringDate) {
		super(name, responsibiltyDesc, officeID, hiringDate);
	}

	// add Student
	public void addStudent(Student student) {
		if (students == null) {
			this.students = new ArrayList<Student>();
		}
		if (!students.contains(student)) {
			students.add(student);
		} else {
			students.remove(student);
			students.add(student);
		}
	}

	// remove Student
	public void removeStudent(Student student) {
		if (student != null && students != null) {
			students.remove(student);
		}
	}

	public Collection<Student> getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Coach [students=" + students + "]";
	}

}
