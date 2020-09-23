package miu.edu.comproTM.model.helpers;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Employee {
	
	private String name;
	private String responsibiltyDesc;
	private String officeID;
	private LocalDate hiringDate;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String responsibiltyDesc, String officeID, LocalDate hiringDate) {
		super();
		this.name = name;
		this.responsibiltyDesc = responsibiltyDesc;
		this.officeID = officeID;
		this.hiringDate = hiringDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResponsibiltyDesc() {
		return responsibiltyDesc;
	}
	public void setResponsibiltyDesc(String responsibiltyDesc) {
		this.responsibiltyDesc = responsibiltyDesc;
	}
	public String getOfficeID() {
		return officeID;
	}
	public void setOfficeID(String officeID) {
		this.officeID = officeID;
	}
	public LocalDate getHiringDate() {
		return hiringDate;
	}
	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	} 

}
