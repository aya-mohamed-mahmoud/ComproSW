package miu.edu.comproTM.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miu.edu.comproTM.model.Student;
import miu.edu.comproTM.model.TmInstructor;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	public List<Student>  assiggnStudent();
 
   
 }
