package edu.miu.cs544.eaproject.team5.studentmicroservice.serviceImpl;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Faculty;
import edu.miu.cs544.eaproject.team5.studentmicroservice.repository.FaculityRepository;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.FaculityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaculityServiceImp implements FaculityService {

	@Autowired
	private FaculityRepository faculityRepository;

	@Override
	public Faculty getFaculityByName(String name) {
		
		return faculityRepository.getFaculityByName(name);
	}

	@Override
	public List<Faculty> getAllFaculity() {
		
		return faculityRepository.findAll();
	}

	@Override
	public Faculty getFaculityById(int id) {
		
		 if(faculityRepository.findById(id).isPresent())
			 return faculityRepository.findById(id).get();
		 return null;
	}
}
