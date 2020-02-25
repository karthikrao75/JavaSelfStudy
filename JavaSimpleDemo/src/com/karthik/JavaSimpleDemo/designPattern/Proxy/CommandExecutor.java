package com.karthik.JavaSimpleDemo.designPattern.Proxy;

import java.io.IOException;

public interface CommandExecutor {

	void executeCommand(String command) throws IOException;
}
