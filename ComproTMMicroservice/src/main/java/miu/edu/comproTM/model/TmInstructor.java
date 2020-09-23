package miu.edu.comproTM.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class TmInstructor extends Employee{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private LocalDate date;
    
    @OneToMany
    private List<SessionAttendance> tmattandance= new ArrayList<>();
    
    @OneToMany
    private List<Student> student= new ArrayList<>();

	public TmInstructor() {
		super();
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


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public List<SessionAttendance> getTmattandance() {
		return tmattandance;
	}


	public void setTmattandance(List<SessionAttendance> tmattandance) {
		this.tmattandance = tmattandance;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}




    
}
