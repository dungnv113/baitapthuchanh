package model;

import java.util.Scanner;

public class Person {
	private int age;
	private String name;

	public Person() {
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void intput() {
		System.out.println("name: ");
		Scanner scName = new Scanner(System.in);
		name = scName.nextLine();
		System.out.println("age: ");
		Scanner scAge = new Scanner(System.in);
		age = scName.nextInt();

	 }

	public void info() {
		System.out.println(age);
		System.out.println(name);
	}

}
