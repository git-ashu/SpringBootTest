package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService CourseService;

	@GetMapping("/")
	public String home(){
		return "Welcome to Spring Boot Test Page. Please modify URL[/home;/courses;/courses/101; 201/301]";
	}

	@GetMapping("/home")
	public String home(){
		return "This is Home Page.";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourse(){
		return this.CourseService.getCourses();
	}
	
	//get specific course from course id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.CourseService.getCourse(Long.parseLong(courseId));
	}

	
}
