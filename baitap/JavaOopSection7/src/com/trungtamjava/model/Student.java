package com.trungtamjava.model;

import java.util.Scanner;

public class Student extends Person {

	private String studentClass;

	public void input() {
		// TODO Auto-generated method stub

		super.input();
		System.out.println("enter studentClass ");
		Scanner  scClass = new Scanner(System.in);
		studentClass = scClass.nextLine();
	}

	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(studentClass);

	}
}
