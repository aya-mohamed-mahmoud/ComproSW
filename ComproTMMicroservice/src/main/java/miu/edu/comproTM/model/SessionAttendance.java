package miu.edu.comproTM.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class SessionAttendance {
    @Id
    @GeneratedValue
    private int Id;
    
    private LocalDate date;
    
    private SessionType type;
    
    private boolean meditationAttandance;
    
    @ManyToMany(mappedBy = "attendances")
    private List<Student> students= new ArrayList<>();

    @OneToMany(mappedBy = "tmattandance")
    private TmInstructor tm ;

	public SessionAttendance() {
		super();
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

	public TmInstructor getTm() {
		return tm;
	}

	public void setTm(TmInstructor tm) {
		this.tm = tm;
	}




}
