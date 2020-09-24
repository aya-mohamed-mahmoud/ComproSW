package miu.edu.comproTM.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class TmInstructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String name;
	private String responsibiltyDesc;
	private String officeID;
	private LocalDate hiringDate;

	public TmInstructor(int id, String name, String responsibiltyDesc, String officeID, LocalDate hiringDate) {
		this.id = id;
		this.name = name;
		this.responsibiltyDesc = responsibiltyDesc;
		this.officeID = officeID;
		this.hiringDate = hiringDate;
	}

	@JsonIgnore
	@OneToMany(mappedBy="instructor")
	private List<InstructorStudent> instructorStudents;

	public TmInstructor() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResponsibiltyDesc() {
		return responsibiltyDesc;
	}

	public void setResponsibiltyDesc(String responsibiltyDesc) {
		this.responsibiltyDesc = responsibiltyDesc;
	}

	public String getOfficeID() {
		return officeID;
	}

	public void setOfficeID(String officeID) {
		this.officeID = officeID;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}

	public List<InstructorStudent> getInstructorStudents() {
		return instructorStudents;
	}

	public void setInstructorStudents(List<InstructorStudent> instructorStudents) {
		this.instructorStudents = instructorStudents;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
    
}