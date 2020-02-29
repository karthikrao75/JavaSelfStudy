package com.karthik.JavaSimpleDemo.designPattern.strategy;

public class Player {

	private String type;
	private CounterStrikeStrategy counterStrikeStrategy;
	
	public Player(String type) {
		super();
		this.type = type;
	}
	
	public void setStrategy(CounterStrikeStrategy counterStrikeStrategy){
		this.counterStrikeStrategy = counterStrikeStrategy;
		
	}
	
	public void action(){
		System.out.println("Player :"+type);
		counterStrikeStrategy.action();
	}
	
}
