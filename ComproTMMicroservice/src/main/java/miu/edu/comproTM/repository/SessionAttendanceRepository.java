package miu.edu.comproTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import miu.edu.comproTM.model.SessionAttendance;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionAttendanceRepository extends JpaRepository<SessionAttendance,Integer>{


      
  }
          
