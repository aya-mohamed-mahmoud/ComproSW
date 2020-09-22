package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String studentId;
    @Temporal(TemporalType.DATE)
    private Date enrollmentDate;
    @Temporal(TemporalType.DATE)
    private Date graduationDate;
    private Double GPA;
    @Embedded
    private  Address address;
    
    @ManyToMany
    private List<Attendance> attendances= new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER)
    private  List<Grade> grades=new ArrayList<>();   
    
  //@ManyToOne
    private String coach;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Course> courses= new ArrayList<>();
    
//    @OneToOne
    private  String jobId;
//    
   
//    
    
//    
//    @ManyToOne
    private String departmentId;
public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public String getJobsearchreportId() {
		return jobsearchreportId;
	}

	public void setJobsearchreportId(String jobsearchreportId) {
		this.jobsearchreportId = jobsearchreportId;
	}

	//    
//    @OneToOne    
    private String appointment; 
//    
//    @OneToMany
    private  String jobsearchreportId;
//    
    


public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Attendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	//    
   
//    @OneToMany
//    private  List<TMRecord> tmRecords= new ArrayList<>();
//    @OneToOne
//    private  JobSearchReport jobSearchReport;

    public Student() {
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
