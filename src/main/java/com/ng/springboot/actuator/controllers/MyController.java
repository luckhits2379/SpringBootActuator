package com.ng.springboot.actuator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ng.springboot.actuator.beans.Student;

@RestController
public class MyController {

	@Autowired
	Student student;

	@GetMapping("/data")
	public ResponseEntity<Student> getData() {

		student.setName("Nirmal");
		student.setId(1);

		return ResponseEntity.accepted().body(student);
	}
}
