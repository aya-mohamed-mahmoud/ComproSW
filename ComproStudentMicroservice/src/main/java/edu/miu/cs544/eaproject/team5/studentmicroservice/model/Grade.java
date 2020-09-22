package edu.miu.cs544.eaproject.team5.studentmicroservice.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Grade {
	@Id
	@GeneratedValue
	private int id;
	private String grade;
	@ManyToOne
	private Student studentes;
	
	@ManyToOne
	private Course courses;
	
	
	public Grade() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student getStudentes() {
		return studentes;
	}
	public void setStudentes(Student studentes) {
		this.studentes = studentes;
	}
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	} 
	

}
