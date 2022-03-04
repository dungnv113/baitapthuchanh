package com.trungtamjava.company;

import java.util.Scanner;

public class Tester extends Person {
String testTools;

public void input() {
		// TODO Auto-generated method stub
		super.input();
System.out.println("enter the testTools: ");
Scanner scTest = new Scanner(System.in);
testTools = scTest.nextLine();
}
public void info() {
		// TODO Auto-generated method stub
		super.info();
System.out.println(testTools);	
}
}
