package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private int id;
}
