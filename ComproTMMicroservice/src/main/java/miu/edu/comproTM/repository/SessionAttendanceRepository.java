package miu.edu.comproTM.repository;

import miu.edu.comproTM.model.SessionAttendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionAttendanceRepository extends JpaRepository<SessionAttendance,Integer>{


      
  }
          
