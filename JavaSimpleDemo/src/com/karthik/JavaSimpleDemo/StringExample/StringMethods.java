package com.karthik.JavaSimpleDemo.StringExample;

public class StringMethods {
	public static void main(String []args){
		String s1="karthik";
		s1.concat("R Rao");
		System.out.println(s1);
		//result : karthik so string is immutable
	
		System.out.println(s1.length());
		//length of char starting from 1
		
		System.out.println(s1.charAt(3));
		//output : t ,takes index as parameter.indexing starts from 0.
		
		String s2=" karthik ";
		System.out.println(s2.length());//length 9
		
		System.out.println(s2.trim());
		
		System.out.println(s2.trim().length());
	//length 7
		// removes leading n trailing white spaces .
		String s3=new String("ABC");
		String s4=new String("ABC");
		
		System.out.println(s3.equals(s4));
		//returns true 
		System.out.println(s3==s4);
		//returns false
		String s5="ABC";
		String s6="ABC";
		
		System.out.println(s5.equals(s6));
		//true
		System.out.println(s5==s6);
		//true
		
		System.out.println(s5.equals(s3));
		//true
		System.out.println(s5==s3);
		//false
		

		System.out.println(s3.hashCode()==s4.hashCode());
		System.out.println(s5.hashCode()==s4.hashCode());
		System.out.println(s5.hashCode()==s6.hashCode());
		//return true
		
		
		String s7=new String("CBA");
		System.out.println(s3.hashCode()==s7.hashCode());
		//false
		
		
		String s8=null;
		String s9="";
		//System.out.println(s8.charAt(0));
		//null pointer exception
		
		//System.out.println(s9.charAt(0));
		//string index out of bound exception since s9 is a empty string with index -1.
		System.out.println("ji"+null);
		//jinull
		System.out.println(null+"kar");
		//nullkar
		//System.out.println(null+null);
		//compile time error
		
		String s10=s8+s9;
		System.out.println(s10.charAt(0));
		//n
		System.out.println(s10.length());
		//4
		System.out.println("888888888888888888888888888888888888888888");
		//s10=s9.concat(s8);
		//System.out.println(s10);
		//null pointer exception
		//s10=s8.concat(s9);
		//System.out.println(s10);
		//null pointer exception
		
		String[] s={"hi","hello"};
		System.out.println(s.length);
		System.out.println(s[1].length());
		System.out.println(new String("HI"));
		
		
		float floatVar=3.0f;
		int intVar=9;
		String stringVar="sri";
		String fs;
		fs = String.format("The value of the float variable is " +
		                   "%f, while the value of the integer " +
		                   "variable is %d, and the string " +
		                   "is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
		
		String s11="Karthik";
		System.out.println(s11.contains("Ka"));
		//true
		CharSequence c="Karthik";
		System.out.println(s11.contentEquals(c));
		//true
		System.out.println(s11.equals(c));
		//true
		//System.out.println(s11.contentEquals(null));
		//NullPointerExceptions
		System.out.println(s11.equals(null));
		//false
		
		if(s11 instanceof CharSequence)
		{
			System.out.println("String is a instanceof CharSequence");
			//will come in
		}
		String s12="detaink";
		System.out.println(s11.endsWith("k"));
		//false
		System.out.println(s11.lastIndexOf('k'));
		//6
		System.out.println(s11.hashCode());
		//will give hashcode 
		System.out.println(s11.isEmpty());
		//false
		System.out.println("".isEmpty());
		//true
		System.out.println(s11.indexOf("kar"));
		//will give starting index of string that you have passed
		
		System.out.println(s11.indexOf('k', 3));
		//6
		
		System.out.println(s11.substring(3, 4));
		//t
		
		String s13="¿";
		
		System.out.println(s11.toLowerCase());
		//karthik
		System.out.println((char)(s1.codePointAt(3)));
		//ascii value of 't' which was then converted into char
		char c1='t';
		System.out.println((int)c1);
		//will give ascii value
		
		String s14="AABBCC";
		System.out.println(s14.lastIndexOf("A"));
		//1
		System.out.println(s14.lastIndexOf("B"));
		//3
		System.out.println(s14.lastIndexOf("C"));
		//5
		System.out.println(s14.lastIndexOf("D"));
		//-1
		
		System.out.println(s11.replace('k', 'A'));
		//KarthiA
		System.out.println(s11.replaceAll("[K,k]", "A"));
		//AarthiA
		
		String s15="Ad059JaZ%	";
		
		//ending with tab
		System.out.println(s15.replaceAll("[A-K,a-d,0-5,%,\t]", "p"));
		//pppp9ppZpp
		
		System.out.println(s15.replaceAll(s15, "p"));
		//p
		String s16="Ad059JaZ%A";
		System.out.println(s15.replaceAll("[^A]", "p"));
		//negation replaces all other then A- Appppppppp
		
		System.out.println(s11.matches("(.*)art(.*)"));
		//ture
		
		System.out.println(s11.toCharArray());
		// will give char array
		String s17="karthik r Rao";
				String []a=s17.split(" ");
		String []b=s17.split("k");
		System.out.println(b[0]);
		//blank
		System.out.println(b[1]);
		//arthi
		System.out.println(b[2]);
		// r Rao
		
		String []b1=s17.split("k", 2);
		System.out.println(b1[0]);
		//blank
		System.out.println(b1[1]);
		//arthik r Rao
		//System.out.println(b1[2]);
		// array index out of bound exception.
		
		
		
		
	}
}

