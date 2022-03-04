package com.trungtamjava.model;

import java.util.Scanner;

public class MainTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher();
	}

	public static void Teacher() {
		System.out.println("enter the number: ");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		Teacher[] teachers = new Teacher[n1];
		for (int i = 0; i < teachers.length; i++) {
			teachers[i] = new Teacher();
			teachers[i].input();

		}
		for (int i = 0; i < teachers.length; i++) {
			teachers[i].info();

		}
	}
}
