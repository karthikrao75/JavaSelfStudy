package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread7 extends Thread {
	Show show;
	String name;

	public MyThread7(Show show, String name) {
		this.show = show;
		this.name = name;
	}

	public void run() {
		show.moringShow(name);
	}
}
