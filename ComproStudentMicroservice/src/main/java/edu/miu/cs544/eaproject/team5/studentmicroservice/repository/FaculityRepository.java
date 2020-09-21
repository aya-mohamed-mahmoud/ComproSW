package edu.miu.cs544.eaproject.team5.studentmicroservice.repository;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Faculity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculityRepository extends JpaRepository<Faculity,Integer> {
}
