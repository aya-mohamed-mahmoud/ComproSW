package com.miu.eureca.model.entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Faculty extends Employee{
    @Id
    @GeneratedValue
    private int id;
    
    private String name;
    private LocalDate hiringDate;
    private int roomNumber;
    
    @OneToMany(mappedBy = "faculty")
    private List<Course> courses= new ArrayList<>();
    
    @Embedded
    private Address address;

    public Faculty() {
    }
}
