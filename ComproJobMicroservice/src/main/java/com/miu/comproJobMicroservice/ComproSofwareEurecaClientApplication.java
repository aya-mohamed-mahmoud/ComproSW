package com.miu.comproJobMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComproSofwareEurecaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComproSofwareEurecaClientApplication.class, args);
	}

}
