package com.karthik.JavaSimpleDemo.designPattern.mediator;

public class UserImpl extends User {

	public UserImpl(String name, ChatMediator chatMediator) {
		super(name, chatMediator);
	}

	@Override
	public void send(String msg, User user) {
		System.out.println(this.name + " Sending message :-" + msg);
		chatMediator.sendMessage(msg, user);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " Received message :-" + msg);
	}

}
