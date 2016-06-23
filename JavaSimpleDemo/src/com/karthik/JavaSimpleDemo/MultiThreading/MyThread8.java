package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread8 extends Thread {
	Show1 show;

	public MyThread8(Show1 s) {
		this.show = s;
	}
	public void run(){
		show.shownumber();
	}
}
