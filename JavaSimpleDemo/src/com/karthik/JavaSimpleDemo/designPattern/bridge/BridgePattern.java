package com.karthik.JavaSimpleDemo.designPattern.bridge;

public class BridgePattern {

	public static void main(String[] args) {
		CircleShape circleShape = new CircleShape(new BlueColor());
		circleShape.drawShape();
		TriangleShape triangleShape  = new TriangleShape(new RedColor());
		triangleShape.drawShape();
	}

}
