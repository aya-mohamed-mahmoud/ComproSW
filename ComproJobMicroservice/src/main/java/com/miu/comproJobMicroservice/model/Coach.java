package com.miu.comproJobMicroservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Coach extends Employee{

	public Coach() {
	}

	public Coach(String name, String responsibiltyDesc, String officeID, LocalDate hiringDate) {
		super(name, responsibiltyDesc, officeID, hiringDate);
	}
	

}
