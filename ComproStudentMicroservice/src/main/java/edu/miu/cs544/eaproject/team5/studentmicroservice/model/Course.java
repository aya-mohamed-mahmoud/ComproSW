package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String building;
    private int roomNumber;
    private List<Faculity> faculities= new ArrayList<>();
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students= new ArrayList<>();
    @ManyToMany(mappedBy = "")
    private List<TAStudent> taStudents= new ArrayList<>();

    public Course() {
    }
}
