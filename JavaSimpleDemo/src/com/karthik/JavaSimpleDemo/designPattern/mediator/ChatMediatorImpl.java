package com.karthik.JavaSimpleDemo.designPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	List<User> users = new ArrayList<>();

	@Override
	public void sendMessage(String message, User user) {
		for(User u : this.users){
			if(u.name.equals(user.name)){
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
