package miu.edu.comproTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import miu.edu.comproTM.model.TmInstructor;
import org.springframework.stereotype.Repository;

@Repository
public interface TmInstructorRepository extends JpaRepository<TmInstructor,Integer>{
	
 }
