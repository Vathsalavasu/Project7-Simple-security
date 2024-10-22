package com.springsecuritybasic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecuritybasic.entity.Student;

@RestController
public class StudentController {
	
	List<Student> students = new ArrayList<>(List.of(
			new Student(1, "Vaths" ,"Spring"),
			 new Student(2, "Maddy" , "RestAPI") 		
					));
	
	@GetMapping("students")
	public List<Student>getStudents(){
		return students;
	}
	
	@PostMapping("students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}

}
