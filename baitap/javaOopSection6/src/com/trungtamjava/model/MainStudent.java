package com.trungtamjava.model;

import java.util.Scanner;

public class MainStudent {
	public static void Student(String agrs[]) {
		System.out.println("enter the number of student: ");
		Scanner scStudent = new Scanner(System.in);
		int number = scStudent.nextInt();

		Student[] students = new Student[number];

		for (int i = 0; i < students.length; i++) {

			students[i] = new Student();
			students[i].input();
		}
		for (int i = 0; i < students.length; i++) {
			students[i].info();
		}

		for (int i = 0; i < students.length; i++) {
			for (int k = i; i < students.length; k++) {
				if (students[i].getAge() > students[k].getAge()) {
					Student temp = students[i];
					students[i]=students[k];
					students[k]=temp;

				}
			}
		}
		for(int i = 0; i < students.length; i++) {
			students[i].info();
		}
		System.out.println("the oldest student: ");
		for(int i = 0;i<students.length;i++) {
			if(students[i].getAge()==students[students.length].getAge()) {
				students[i].info();
			}
		}
	}
}
