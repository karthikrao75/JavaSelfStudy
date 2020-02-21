package com.karthik.JavaSimpleDemo.designPattern;

import java.util.Arrays;
import java.util.List;

public class StatementPrototype implements Cloneable {

	private String sql;
	private List<String> parameters;
	private Record record;

	public StatementPrototype() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatementPrototype(String sql, List<String> parameters, Record record) {
		super();
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public StatementPrototype clone() {
		try {
			return (StatementPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

}

class Record {

}

class Tester {
	public static void main(String[] args) {
		StatementPrototype prototype = new StatementPrototype("Select * from employee where name=?",
				Arrays.asList("karthik"), new Record());

		System.out.println(prototype.getSql());
		System.out.println(prototype.getParameters());
		System.out.println(prototype.getRecord());

		StatementPrototype prototype2 = prototype.clone();
		prototype.setSql("");
		System.out.println(prototype2.getSql());
		System.out.println(prototype2.getParameters());
		System.out.println(prototype2.getRecord());
	}

}