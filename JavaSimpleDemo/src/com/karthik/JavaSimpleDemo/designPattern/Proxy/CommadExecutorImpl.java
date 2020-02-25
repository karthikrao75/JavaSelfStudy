package com.karthik.JavaSimpleDemo.designPattern.Proxy;

import java.io.IOException;

public class CommadExecutorImpl implements CommandExecutor {

	@Override
	public void executeCommand(String command) throws IOException {
		//Runtime.getRuntime().exec(command);
		System.out.println("Command completed -" + command);
	}

}
