package com.miu.comproJobMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miu.comproJobMicroservice.model.Job;

@Repository
public interface JobDAO extends JpaRepository<Job, Integer>{

}
