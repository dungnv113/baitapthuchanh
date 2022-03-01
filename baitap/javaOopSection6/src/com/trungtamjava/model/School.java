package com.trungtamjava.model;

import java.util.Scanner;

public class School {
	private int id;
	private String schoolName;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void School(int id, String schoolName,String address) {
		this.id = id;
		this.schoolName = schoolName;
		this.address = address;
	}
	
	public void input() {
		Scanner scId = new Scanner(System.in);
		System.out.println("enter id: ");
		id = scId.nextInt();
		Scanner scSchoolname = new Scanner(System.in);
		System.out.println("enter Schoolname: ");
		schoolName = scSchoolname.nextLine();
	}
	public void info() {
		System.out.println(id);
		System.out.println(schoolName);
	}
}
