package edu.miu.cs544.eaproject.team5.studentmicroservice.repository;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByName(String name);
}
