package com.karthik.JavaSimpleDemo.JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestTest {
	Tester t1;
	StubConn c1;
	StubConn1 c2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		t1=new Tester();
		c1=new StubConn();
		c2=new StubConn1(){
			public boolean getConn(String s1,String s2)
			{
				return false;
			}
		};
	}

	@Test
	public void testStringConcat1() {
    assertEquals("HelloWorld",t1.stringConcat("Hello","World",c1));
	}
    @Test(expected=NullPointerException.class)
	public void testStringConcat2() {
    assertEquals("HelloWorld",t1.stringConcat(null,"World",c1));
    }
    @Test
   	public void testStringConcat3() {
       assertEquals("World",t1.stringConcat("","World",c1));
	}
    @Test
	public void testStringConcat4() {
    assertEquals("",t1.stringConcat("","World",c2));
    }

}
