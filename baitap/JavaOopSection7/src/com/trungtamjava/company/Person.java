package com.trungtamjava.company;

import java.util.Scanner;

public class Person {
	int id;
	String name;
	int age;
	public void input() {
		System.out.println("enter the name: ");
		Scanner scName = new Scanner(System.in);
		name = scName.nextLine();
		
		System.out.println("enter the id: ");
		Scanner scID = new Scanner(System.in);
		id = scID.nextInt();
		
		System.out.println("enter the age: ");
		Scanner scAge= new Scanner(System.in);
		age = scAge.nextInt();
		
	}
	public void info() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		
	}
}
