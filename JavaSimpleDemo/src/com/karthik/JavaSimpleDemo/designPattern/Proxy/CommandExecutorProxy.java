package com.karthik.JavaSimpleDemo.designPattern.Proxy;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin = Boolean.FALSE;
	private CommandExecutor commandExecutor;

	public CommandExecutorProxy(String userName, String password) {
		if (userName.equals("Admin") && password.equals("welcome123")) {
			isAdmin = Boolean.TRUE;
		}
		commandExecutor = new CommadExecutorImpl();
	}

	@Override
	public void executeCommand(String command) throws IOException {
		if (isAdmin) {
			commandExecutor.executeCommand(command);
		} else {
			throw new AccessDeniedException("Non admin user");
		}

	}

}
