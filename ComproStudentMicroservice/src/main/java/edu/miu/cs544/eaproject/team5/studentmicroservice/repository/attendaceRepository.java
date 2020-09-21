package edu.miu.cs544.eaproject.team5.studentmicroservice.repository;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface attendaceRepository  extends JpaRepository<Attendance,Integer> {
}
