package com.miu.eureca.model.entity;

import javax.persistence.Entity;
import java.util.Date;
@Entity
public class TAStudent extends Student{
    private double salary;

    public TAStudent() {
    }

    public TAStudent(int id, String name, String studentId, Date enrollmentDate, Date graduationDate, double GPA, Address address, double salary) {
        super(id, name, studentId, enrollmentDate, graduationDate, GPA, address);
        this.salary = salary;
    }
}
