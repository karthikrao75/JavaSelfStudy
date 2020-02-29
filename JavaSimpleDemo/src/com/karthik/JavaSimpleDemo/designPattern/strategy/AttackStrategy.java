package com.karthik.JavaSimpleDemo.designPattern.strategy;

public class AttackStrategy implements CounterStrikeStrategy {

	@Override
	public void action() {
		System.out.println("Attack and kill apponenet");
	}

}
