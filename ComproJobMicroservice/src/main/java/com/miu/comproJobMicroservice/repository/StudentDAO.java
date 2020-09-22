package com.miu.comproJobMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miu.comproJobMicroservice.model.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{

}
