package com.trungtamjava.company;

import java.util.Scanner;

public class Developer extends Person{

String programLanguage;
public Developer() {
	
}

public String getProgramLanguage() {
	return programLanguage;
}

public void setProgramLanguage(String programLanguage) {
	this.programLanguage = programLanguage;
}

public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("enter the programLanguage: ");
		Scanner scPro = new Scanner(System.in);
		programLanguage = scPro.nextLine();
	}
public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(programLanguage);
		
	}
}
