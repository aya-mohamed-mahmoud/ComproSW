package com.miu.comproJobMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miu.comproJobMicroservice.model.Coach;


public interface CoachRepository extends JpaRepository<Coach, Integer> {

}
