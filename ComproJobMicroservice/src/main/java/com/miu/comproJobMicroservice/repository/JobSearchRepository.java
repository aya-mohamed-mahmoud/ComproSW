package com.miu.comproJobMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miu.comproJobMicroservice.model.JobSearchReport;

@Repository
public interface JobSearchRepository extends JpaRepository<JobSearchReport, Integer> {

}
