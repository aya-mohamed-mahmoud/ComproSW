package miu.edu.comproTM.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
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
   // private  Address address;
    @OneToOne
   // private  Job job;
   // @ManyToMany
  //  private List<Course> courses= new ArrayList<>();
    @ManyToMany
    private List<SessionAttendance> attendances= new ArrayList<>();
    
    @OneToMany
    private  List<TMRecord> tmRecords= new ArrayList<>();
    
    @ManyToOne
    private  TmInstructor tmInstructor;
   
   // @OneToOne
   // private  JobSearchReport jobSearchReport;

    public Student() {
    }

//    public Student(int id, String name, String studentId, Date enrollmentDate, Date graduationDate, double GPA, Address address) {
//        this.id = id;
//        this.name = name;
//        this.studentId = studentId;
//        this.enrollmentDate = enrollmentDate;
//        this.graduationDate = graduationDate;
//        this.GPA = GPA;
//        this.address = address;
//    }

    public TmInstructor getTmInstructor() {
		return tmInstructor;
	}

	public void setTmInstructor(TmInstructor tmInstructor) {
		this.tmInstructor = tmInstructor;
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

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
