package com.miu.comproJobMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miu.comproJobMicroservice.model.Student;
import com.miu.comproJobMicroservice.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepository studentDAO;

	@Override
	public Student getStudentByJobId(int id) {

		if (studentDAO.findById(id) != null) {
			return studentDAO.findById(id).get();
		}
		return null;
	}

}
