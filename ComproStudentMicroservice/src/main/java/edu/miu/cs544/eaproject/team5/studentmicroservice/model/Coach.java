package edu.miu.cs544.eaproject.team5.studentmicroservice.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;



public class Coach extends Employee{
	
	//@OneToMany(mappedBy="coach")
	private List<Student> studnts=new ArrayList<>();
			

	public Coach() {
		super();
		
	}


	public List<Student> getStudnts() {
		return studnts;
	}


	public void setStudnts(List<Student> studnts) {
		this.studnts = studnts;
	}

	
		
	}
	


