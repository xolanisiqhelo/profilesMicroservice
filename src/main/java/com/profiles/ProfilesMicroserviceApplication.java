package com.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan({"com.profiles"})
public class ProfilesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilesMicroserviceApplication.class, args);
	}

}
