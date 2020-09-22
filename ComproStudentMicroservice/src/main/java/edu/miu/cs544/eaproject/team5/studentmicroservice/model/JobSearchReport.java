//package edu.miu.cs544.eaproject.team5.studentmicroservice.model;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//@Entity
//public class JobSearchReport {
//	@Id
//	@GeneratedValue
//	private int id;
//
//	private LocalDate submittedDate;
//
//	@Length(min = 30, max = 100)
//	private String desc;
//
//	public JobSearchReport() {
//	}
//
//	public JobSearchReport(LocalDate submittedDate, String desc) {
//		this.submittedDate = submittedDate;
//		this.desc = desc;
//	}
//
//	public LocalDate getSubmittedDate() {
//		return submittedDate;
//	}
//
//	public void setSubmittedDate(LocalDate submittedDate) {
//		this.submittedDate = submittedDate;
//	}
//
//	public String getDesc() {
//		return desc;
//	}
//
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//	
//	
//	
//}
