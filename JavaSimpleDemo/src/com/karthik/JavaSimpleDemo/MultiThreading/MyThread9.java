package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread9 extends Thread{
	Show1 show;
	public MyThread9(Show1 s){
		this.show=s;
	}
	public void run(){
		show.showChar();
	}
}
