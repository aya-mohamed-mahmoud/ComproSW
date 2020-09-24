package miu.edu.comproTM.repository;

import miu.edu.comproTM.model.InstructorStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorStudentRepository extends CrudRepository<InstructorStudent,Integer>{

    List<InstructorStudent> getInstructorStudentsByInstructor_Id(int instructorId);

}
