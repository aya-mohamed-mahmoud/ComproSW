package miu.edu.comproTM.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miu.edu.comproTM.model.Student;
import miu.edu.comproTM.model.TmInstructor;

public interface TmInstructorRepository extends CrudRepository<TmInstructor,Integer>{
	
	public List<Student>  assiggnStudent();
 
   
 }
