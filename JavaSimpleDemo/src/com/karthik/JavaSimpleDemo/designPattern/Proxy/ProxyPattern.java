package com.karthik.JavaSimpleDemo.designPattern.Proxy;

import java.io.IOException;

public class ProxyPattern {

	public static void main(String[] args) throws IOException {
		CommandExecutorProxy executorProxy=new CommandExecutorProxy("Admin", "welcome123");
		executorProxy.executeCommand("ls");
		
		CommandExecutorProxy executorProxy1=new CommandExecutorProxy("karthik", "password");
		executorProxy1.executeCommand("ls");
	}

}
