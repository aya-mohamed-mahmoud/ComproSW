package edu.miu.cs544.eaproject.team5.studentmicroservice.repository;


import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculityRepository extends JpaRepository<Faculty,Integer> {
	public Faculty getFaculityByName(String name);
}
