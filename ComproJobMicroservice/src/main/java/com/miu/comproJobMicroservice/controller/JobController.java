package com.miu.comproJobMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miu.comproJobMicroservice.service.JobServiceImpl;


@RestController
public class JobController {
	
	@Autowired
	private JobServiceImpl jobService;

//	@GetMapping("/all")
//	public List<Country> getAllCountries() {
//		return countryService.getAllCountries();
//	}
}
