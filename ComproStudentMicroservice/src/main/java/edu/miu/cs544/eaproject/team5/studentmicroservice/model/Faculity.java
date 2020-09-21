package edu.miu.cs544.eaproject.team5.studentmicroservice.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Faculity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date hiringDate;
    private int roomNumber;
    @ManyToMany
    private List<Course> courses= new ArrayList<>();
    @Embedded
    private Address address;

    public Faculity() {
    }
}
