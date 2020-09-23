package miu.edu.comproTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import miu.edu.comproTM.model.SessionAttendance;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionAttendanceRepository extends JpaRepository<SessionAttendance,Integer>{
    
	       
//      @Query(value="select session from SessionAttendance as session join student as s on session.attendances=s.id"
//      		+ " join TmInstructor as t on t.id=session.tmattandance")
//      public List <SessionAttendance> getSession();
      
  }
          
