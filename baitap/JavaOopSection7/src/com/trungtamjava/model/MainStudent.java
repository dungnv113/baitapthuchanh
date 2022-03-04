package com.trungtamjava.model;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student();
	}

	public static void student() {
		Scanner scNum = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = scNum.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].input();
		}
		for (int i = 0; i < students.length; i++) {

			students[i].info();
		}
	}
}
