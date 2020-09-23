package com.miu.comproJobMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miu.comproJobMicroservice.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findStudentByStuId(String studentId);

}
