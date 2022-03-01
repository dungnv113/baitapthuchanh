package com.trungtamjava.model;

import java.util.Scanner;

public class Student {
int id;
String name;
int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
	Scanner scId = new Scanner(System.in);
	System.out.println("enter id: ");
	id = scId.nextInt();
	Scanner scName = new Scanner(System.in);
	System.out.println("enter name: ");
	name = scName.nextLine();
	Scanner scAge = new Scanner(System.in);
	System.out.println("enter age: ");
	age = scAge.nextInt();
	
}
public void info() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(age);
	
}
}

