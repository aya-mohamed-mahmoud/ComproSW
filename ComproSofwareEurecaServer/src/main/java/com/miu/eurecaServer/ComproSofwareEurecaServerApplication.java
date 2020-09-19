package com.miu.eurecaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ComproSofwareEurecaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComproSofwareEurecaServerApplication.class, args);
	}

}
