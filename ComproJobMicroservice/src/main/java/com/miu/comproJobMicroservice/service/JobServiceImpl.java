package com.miu.comproJobMicroservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.comproJobMicroservice.model.Student;
import com.miu.comproJobMicroservice.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobRepository jobDAO;


}
