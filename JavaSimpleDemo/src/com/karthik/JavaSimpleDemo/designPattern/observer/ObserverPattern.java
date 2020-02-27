package com.karthik.JavaSimpleDemo.designPattern.observer;

public class ObserverPattern {

	public static void main(String[] args) {
		Course course=new Course();
		
		Student student1=new Student("karthik");
		Student student2=new Student("Srikanth");
		Student student3=new Student("babishan");
		Student student4=new Student("shakith");
		
		course.register(student1);
		course.register(student2);
		course.register(student3);
		course.register(student4);
		
		student1.setcourse(course);
		student2.setcourse(course);
		student3.setcourse(course);
		student4.setcourse(course);
		
		course.uploadCourse("Java");
	}

}
