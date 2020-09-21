package com.miu.eureca.model.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Coach extends Employee{

	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coach(String name, String responsibiltyDesc, String officeID, LocalDate hiringDate) {
		super(name, responsibiltyDesc, officeID, hiringDate);
		// TODO Auto-generated constructor stub
	}
	

}
