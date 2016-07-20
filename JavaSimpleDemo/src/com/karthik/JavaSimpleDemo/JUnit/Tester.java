package com.karthik.JavaSimpleDemo.JUnit;

public class Tester {
	
public String stringConcat(String s1,String s2,conn c1)
{
	if(c1.getConn(s1,s2))
	return s1.concat(s2);
	else
		return "";
}
}
class conn
{
	public boolean getConn(String s1,String s2)
	{
		if(s1.length()>0)
		return true;
		else
			return false;
	}
}
