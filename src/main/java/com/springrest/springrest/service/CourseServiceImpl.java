package com.springrest.springrest.service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(101, "Core Java", "Demo core java"));
		list.add(new Course(201, "Spring Boot", "Spring Boot Demo"));
		list.add(new Course(301, "Angular", "Angular Demo"));
	}
	
	@Override
	public List<Course> getCourses() {	
		return list;
	}

	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course: list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
		
	}
}
