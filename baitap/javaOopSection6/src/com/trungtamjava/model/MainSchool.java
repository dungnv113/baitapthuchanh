package com.trungtamjava.model;

import java.util.Scanner;

public class MainSchool {
	public MainSchool() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] agrs) {

		System.out.println("enter the number of schools: ");
		Scanner nbosc = new Scanner(System.in);
		int n = nbosc.nextInt();

		School[] school = new School[n];
		for (int i = 0; i < school.length; i++) {
			school[i] = new School();
			school[i].input();
		}

		System.out.println("enter the name: ");
		Scanner name = new Scanner(System.in);
		String s = name.nextLine();
		for(int i=0;i<school.length;i++) {
			if (school[i].getSchoolName().contains(s)) {
				school[i].info();
			}
		}
		
	}

}
