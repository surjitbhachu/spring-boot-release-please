package com.surj.springrelease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReleaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReleaseApplication.class, args);

		// here is a change to the app
		boolean change = true;
	}

}
