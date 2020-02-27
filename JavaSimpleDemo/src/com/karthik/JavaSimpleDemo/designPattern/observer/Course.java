package com.karthik.JavaSimpleDemo.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {

	private String title;
	List<Observer> observers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer ob:observers){
			ob.updateSubject();
		}
	}

	@Override
	public void uploadCourse(String title) {
		this.title=title;
		this.notifyObservers();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
