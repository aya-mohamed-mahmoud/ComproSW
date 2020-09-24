package miu.edu.comproTM.repository;

import miu.edu.comproTM.model.TmInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TmInstructorRepository extends JpaRepository<TmInstructor,Integer>{
	
 }
