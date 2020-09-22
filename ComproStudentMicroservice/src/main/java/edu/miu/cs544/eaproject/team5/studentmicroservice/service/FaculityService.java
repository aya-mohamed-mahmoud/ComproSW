package edu.miu.cs544.eaproject.team5.studentmicroservice.service;

import java.util.List;
import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Faculty;

public interface FaculityService {

	List<Faculty> getAllFaculity();

	Faculty getFaculityById(int id);

	Faculty getFaculityByName(String name);
}
