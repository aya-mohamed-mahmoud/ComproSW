package com.miu.eureca.model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class SessionAttendance {
    @Id
    @GeneratedValue
    private int Id;
    
    private LocalDate date;
    
    private String type;
    
    @ManyToMany(mappedBy = "attendances")
    private List<Student> students= new ArrayList<>();



}
