package com.trungtamjava.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader();
	}

	public static final double luongCoBan = 10000000;

	/*
	 * public static void Developer() { System.out.println("enter the number: ");
	 * Scanner scN1 = new Scanner(System.in); int N1 = scN1.nextInt();
	 * 
	 * Developer[] developers = new Developer[N1]; for(int
	 * i=0;i<developers.length;i++) { developers[i] = new Developer();
	 * developers[i].input(); } for(int i=0;i<developers.length;i++) { //in ra
	 * developer Java if(developers[i].getProgramLanguage())) {
	 * developers[i].info(); } }
	 * 
	 * }
	 */

	public static void Leader() {
		System.out.println("enter the number: ");
		Scanner scN2 = new Scanner(System.in);
		int N2 = scN2.nextInt();

		Leader[] leaders = new Leader[N2];
		for (int i = 0; i < leaders.length; i++) {
			leaders[i] = new Leader();
			leaders[i].input();
		}
		for (int i = 0; i < leaders.length; i++) {
			leaders[i].info();

		}
		for (int i = 0; i < leaders.length; i++) {
			if (leaders[i].getTeamSize() > 10) {
				System.out.println("Luong co ban " + luongCoBan * 0.5);
			} else {
				System.out.println("Luong co ban " + luongCoBan * 0.1);
			}
		}

	}
}
