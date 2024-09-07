package com.springrest.springrest.entities;

public class Course {

	private Long id;
	private String title;
	private String description;
	
	public Course(int id, String title, String description) {
		super();
		this.id = (long) id;
		this.title = title;
		this.description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
	

}
