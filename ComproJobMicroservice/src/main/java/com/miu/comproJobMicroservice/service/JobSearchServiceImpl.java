package com.miu.comproJobMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.comproJobMicroservice.model.Student;
import com.miu.comproJobMicroservice.repository.JobSearchDAO;

@Service
public class JobSearchServiceImpl implements JobSearchService{
	
	@Autowired
	JobSearchDAO jobSearchDAO;

}
