package com.karthik.JavaSimpleDemo.designPattern.mediator;

public abstract class User {
	protected String name;
	protected ChatMediator chatMediator;

	public User(String name, ChatMediator chatMediator) {
		super();
		this.name = name;
		this.chatMediator = chatMediator;
	}

	public abstract void receive(String msg);

	public abstract void send(String msg, User user) ;
}
