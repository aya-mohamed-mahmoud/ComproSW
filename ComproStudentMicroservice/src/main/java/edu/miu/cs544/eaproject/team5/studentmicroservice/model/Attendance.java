package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Attendance {
    @Id
    @GeneratedValue
    private int Id;
   // @Temporal(TemporalType.DATE)
    private LocalDate date;
    private String type;
    @ManyToMany(mappedBy = "attendances")
    private List<Student> students= new ArrayList<>();
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
    



}
