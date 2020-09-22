//package edu.miu.cs544.eaproject.team5.studentmicroservice.model;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//
//public class SessionAttendance {
//    @Id
//    @GeneratedValue
//    private int Id;
//    
//    private LocalDate date;
//    
//    private String type;
//    
//    @ManyToMany(mappedBy = "attendances")
//    private List<Student> students= new ArrayList<>();
//    
//    @ManyToOne
//    private Course courses;
//    
//    @ManyToOne	
//    private TMInstructor tminstructor;
//
//
//
//}
