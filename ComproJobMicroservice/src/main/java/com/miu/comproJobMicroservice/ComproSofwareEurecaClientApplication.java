package com.miu.comproJobMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.miu.comproJobMicroservice.repository"})
@EntityScan(basePackages = {"com.miu.comproJobMicroservice"}) 
public class ComproSofwareEurecaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComproSofwareEurecaClientApplication.class, args);
	}

}
