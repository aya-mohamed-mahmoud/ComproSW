package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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
    @OneToOne
    private  Job job;
    @ManyToMany
    private List<Course> courses= new ArrayList<>();
    @ManyToMany
    private List<Attendance> attendances= new ArrayList<>();
    @OneToMany
    private  List<TMRecord> tmRecords= new ArrayList<>();
    @OneToOne
    private  JobSearchReport jobSearchReport;

    public Student() {
    }

    public Student(int id, String name, String studentId, Date enrollmentDate, Date graduationDate, double GPA, Address address) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
        this.address = address;
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
