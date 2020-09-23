package miu.edu.comproTM.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class InstructorStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer studentId;
	
	@ManyToOne
	@JoinColumn(name = "InstructorId")
	private TmInstructor instructor;

//	@OneToMany(mappedBy = "instructorStudent",fetch=FetchType.EAGER)
//	private List<SessionAttendance> sessionAttendances;

	public InstructorStudent() {
	}

	public InstructorStudent(Integer id, Integer studentId, TmInstructor instructor) {
		this.id = id;
		this.studentId = studentId;
		this.instructor = instructor;
//		this.sessionAttendances = sessionAttendances;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TmInstructor getInstructor() {
		return instructor;
	}

	public void setInstructor(TmInstructor instructor) {
		this.instructor = instructor;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

//	public List<SessionAttendance> getSessionAttendances() {
//		return sessionAttendances;
//	}
//
//	public void setSessionAttendances(List<SessionAttendance> sessionAttendances) {
//		this.sessionAttendances = sessionAttendances;
//	}
}
