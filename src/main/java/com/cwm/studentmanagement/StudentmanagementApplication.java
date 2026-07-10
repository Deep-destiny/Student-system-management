package com.cwm.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * Copyright (c) 2026 Deepak Dhakad
 * Licensed under the MIT License.
 */

@SpringBootApplication
public class StudentmanagementApplication {

	public static void main(String[] args) {

//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//		System.out.println("admin123 -> " + encoder.encode("admin123"));
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

}
