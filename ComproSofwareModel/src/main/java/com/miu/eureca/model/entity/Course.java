package com.miu.eureca.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String building;
    private int roomNumber;
    private List<Faculty> faculities= new ArrayList<>();
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students= new ArrayList<>();
    @ManyToMany(mappedBy = "")
    private List<TAStudent> taStudents= new ArrayList<>();
    
    @ManyToOne
    private Faculty faculty=new Faculty();

    public Course() {
    }
}
