package miu.edu.comproTM.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.Student;


public interface SessionAttendanceRepository extends CrudRepository<SessionAttendance,Integer>{
      public List <Student> getStudent();
      
      @Query(value="select session from SessionAttendance as session join student as s on session.attendances=s.id"
      		+ " join TmInstructor as t on t.id=session.tmattandance")
      public List <SessionAttendance> getSession();
      
  }
          
