package com.trungtamjava.model;

import java.util.Scanner;

public class Person {
	 String name;
	 int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void input() {
		Scanner scName = new Scanner(System.in);
		System.out.println("enter name: ");
		name = scName.nextLine();
	    
		Scanner scAge = new Scanner(System.in);
		System.out.println("enter age: ");
		age = scAge.nextInt();
	}
	public void info() {
		System.out.println(name);
		System.out.println(age);	
		
	}
}



