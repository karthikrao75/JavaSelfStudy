package com.karthik.JavaSimpleDemo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Streams1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(new String[] { "karthik", "Srikanth", "babishan", "shakith" });

		names.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return !t.equals("karthik");
			}
		}).forEach(System.out::println);

		names.stream().filter(Java8Streams1::isNotKarthik).forEach(System.out::println);

		names.stream().map(e -> new User(e)).collect(Collectors.toList());

		names.stream().map(e -> {
			return new User(e);
		}).collect(Collectors.toList());

		List<User> users = names.stream().map(User::new).collect(Collectors.toList());

		System.out.println(users);

		int i = users.stream().mapToInt(User::getAge).distinct().findFirst().getAsInt();
		System.out.println(i);

		System.out.println(users.stream().mapToInt(User::getAge).sum());

		List<Employee> employees = Arrays.asList(new Employee("karthik", Arrays.asList("10", "8", "1")),
				new Employee("babishan", Arrays.asList("10", "11", "2")),
				new Employee("karthik", Arrays.asList("17", "5", "3")));

		employees.stream().map(e -> e.getPhoneNumber().stream()).flatMap(e -> e.filter(num -> num.equals("5")))
				.findAny().ifPresent(System.out::println);

	}

	public static boolean isNotKarthik(String name) {
		return !name.equals("karthik");
	}

}

class User {
	private String userName;
	private int age = 30;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + "]";
	}

}

class Employee {
	private String name;
	private List<String> phoneNumber;

	public Employee(String name, List<String> list) {
		super();
		this.name = name;
		this.phoneNumber = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
}
