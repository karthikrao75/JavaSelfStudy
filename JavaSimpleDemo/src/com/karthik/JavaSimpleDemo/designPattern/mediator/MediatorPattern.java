package com.karthik.JavaSimpleDemo.designPattern.mediator;

public class MediatorPattern {
	
	public static void main(String[] args) {

		ChatMediator chatMediator = new ChatMediatorImpl();

		User user = new UserImpl("karthik", chatMediator);
		User user1 = new UserImpl("srikanth", chatMediator);
		User user2 = new UserImpl("ramesh", chatMediator);
		User user3 = new UserImpl("suresh", chatMediator);
		User user4 = new UserImpl("shakith", chatMediator);
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user);
		chatMediator.addUser(user4);
		
		user.send("Hi How are you ?", user4);
		user2.send("Son, when will you come udupi ?", user1);
	}
}
