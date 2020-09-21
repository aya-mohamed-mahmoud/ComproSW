package edu.miu.cs544.eaproject.team5.studentmicroservice.service;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
   public List<Student> getAllStudent();

   public Student getStudentById(int id);

    public Student getStudentByName(String name);
}
