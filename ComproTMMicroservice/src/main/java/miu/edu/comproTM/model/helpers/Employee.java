package miu.edu.comproTM.model.helpers;


import javax.persistence.Embeddable;
import java.time.LocalDate;

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
