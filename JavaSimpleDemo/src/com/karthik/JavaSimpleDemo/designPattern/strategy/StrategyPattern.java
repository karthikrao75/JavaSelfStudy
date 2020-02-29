package com.karthik.JavaSimpleDemo.designPattern.strategy;

public class StrategyPattern {

	public static void main(String[] args) {
		Player terrorist = new Player("terrorist");
		Player counter_terrorist = new Player("Counter terrorist");
		
		System.out.println("Game Started");
		terrorist.setStrategy(new AttackStrategy());
		counter_terrorist.setStrategy(new DefenceStrategy());
		
		terrorist.action();
		counter_terrorist.action();
		
		System.out.println("Bomb Planted");
		terrorist.setStrategy(new DefenceStrategy());
		counter_terrorist.setStrategy(new AttackStrategy());
		
		terrorist.action();
		counter_terrorist.action();
	}

}
