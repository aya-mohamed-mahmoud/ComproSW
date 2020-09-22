package edu.miu.cs544.eaproject.team5.studentmicroservice.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Faculty {
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

    public Faculty() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    
}
