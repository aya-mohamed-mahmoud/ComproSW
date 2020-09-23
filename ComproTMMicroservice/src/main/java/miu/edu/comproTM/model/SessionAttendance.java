package miu.edu.comproTM.model;


import miu.edu.comproTM.model.helpers.SessionType;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class SessionAttendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
    private LocalDate date;
    
    private SessionType type;
    
    private boolean meditationAttendance;

	public SessionAttendance() {
		super();
	}

	@ManyToOne
	private InstructorStudent instructorStudent;

	public SessionAttendance(int id, LocalDate date, SessionType type, boolean meditationAttendance, InstructorStudent instructorStudent) {
		Id = id;
		this.date = date;
		this.type = type;
		this.meditationAttendance = meditationAttendance;
		this.instructorStudent = instructorStudent;
	}

	public boolean isMeditationAttendance() {
		return meditationAttendance;
	}

	public void setMeditationAttendance(boolean meditationAttendance) {
		this.meditationAttendance = meditationAttendance;
	}

	public InstructorStudent getInstructorStudent() {
		return instructorStudent;
	}

	public void setInstructorStudent(InstructorStudent instructorStudent) {
		this.instructorStudent = instructorStudent;
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

	public SessionType getType() {
		return type;
	}

	public void setType(SessionType type) {
		this.type = type;
	}
}
