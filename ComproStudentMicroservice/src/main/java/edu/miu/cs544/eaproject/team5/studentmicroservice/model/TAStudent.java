package edu.miu.cs544.eaproject.team5.studentmicroservice.model;

import javax.persistence.Entity;

@Entity
public class TAStudent extends Student{
	
    private double salary;

    public TAStudent() {
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    
}
