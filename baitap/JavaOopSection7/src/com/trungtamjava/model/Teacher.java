package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher extends Person{
	
	private String subjects;
	
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("enter the subjects: ");
		Scanner scSub = new Scanner(System.in);
		subjects= scSub.nextLine();
	}
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(subjects);
	}
	
}
