package edu.miu.cs544.eaproject.team5.studentmicroservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByName(String name);
}
