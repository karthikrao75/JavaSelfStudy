package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread91 extends Thread {
	Show3 show;
	String name;

	public MyThread91(Show3 show, String name) {
		this.show = show;
		this.name = name;
	}

	public void run() {
		show.moringShow(name);
	}
}
