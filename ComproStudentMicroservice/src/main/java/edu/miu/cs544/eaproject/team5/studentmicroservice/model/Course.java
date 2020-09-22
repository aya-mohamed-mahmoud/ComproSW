package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String building;
    private int roomNumber;
    
    @ManyToMany(mappedBy = "courses")
    private List<Faculty> faculities= new ArrayList<>();
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    
    @ManyToMany(mappedBy = "courses")
    private List<Student> students= new ArrayList<>();
    
//    @ManyToMany(mappedBy = "courses")
//    private List<TAStudent> taStudents= new ArrayList<>();
    
//    @ManyToOne
//    private List<Department> department= new ArrayList<>();
//    
//    @OneToMany(mappedBy = "courses")
//    private List<SessionAttendance> sessionattendance= new ArrayList<>();
    @OneToMany
    private List<Grade> grades= new ArrayList<>();
    
   

    public List<Grade> getGrades() {
		return grades;
	}



	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}



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



	public List<Faculty> getFaculities() {
		return faculities;
	}



	public void setFaculities(List<Faculty> faculities) {
		this.faculities = faculities;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}



	
    
}

