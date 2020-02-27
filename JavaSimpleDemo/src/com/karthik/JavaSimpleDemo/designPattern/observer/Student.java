package com.karthik.JavaSimpleDemo.designPattern.observer;

public class Student implements Observer {

	private String name;
	private Course course;
	
	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public void updateSubject() {
		System.out.println("Hey " +name+" New Course "+course.getTitle() + " has been added");
	}

	public void setcourse(Course course) {
		this.course = course;
	}

}
