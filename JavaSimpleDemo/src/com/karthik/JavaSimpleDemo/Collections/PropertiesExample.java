package com.karthik.JavaSimpleDemo.Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExample {
	
	// in properties file both key and value should be string
	//it extends hashtable

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Properties properties=new Properties();
		properties.load(new FileInputStream("E:\\JavaEclipse\\LocalGit\\JavaSimpleDemo\\src\\value.properties"));
		
		System.out.println(properties.getProperty("name"));
		
		properties.setProperty("height", "5.11'");
		
		properties.store(new FileOutputStream("E:\\JavaEclipse\\LocalGit\\JavaSimpleDemo\\src\\value.properties"), "added property");
		
		Enumeration enumeration=properties.propertyNames();
		
		//other methods are also present which are taken from hashtable.


	}

}
