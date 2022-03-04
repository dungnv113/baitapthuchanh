package com.trungtamjava.company;

import java.util.Scanner;

public class Leader extends Person {
int teamSize;
public static final double luongCoBan = 10000000;

public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public static double getLuongcoban() {
	return luongCoBan;
}
public void input() {
		// TODO Auto-generated method stub
		super.input();
System.out.println("enter the teamSize: ");
Scanner scTeam = new Scanner(System.in);
teamSize = scTeam.nextInt();
}
public void info() {
		// TODO Auto-generated method stub
		super.info();
System.out.println(teamSize);	
}
}
