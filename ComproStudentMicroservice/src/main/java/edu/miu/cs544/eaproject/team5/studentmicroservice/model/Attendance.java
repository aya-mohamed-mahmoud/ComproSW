package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Attendance {
    @Id
    @GeneratedValue
    private int Id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String type;
    @ManyToMany(mappedBy = "attendances")
    private List<Student> students= new ArrayList<>();



}
