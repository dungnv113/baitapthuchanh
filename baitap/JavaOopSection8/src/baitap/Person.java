package baitap;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String address;
	private House[] houses;
	private Car[] cars;
	
	
	public Person() {
		
	}
	
	public void input() {
		System.out.println("name: ");
		Scanner scName = new Scanner(System.in);
		name = scName.nextLine();
		System.out.println("age: ");
		Scanner scAge = new Scanner(System.in);
		age = scName.nextInt();

	 }
	
	public void info() {
		System.out.println(age);
		System.out.println(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public House[] getHouses() {
		return houses;
	}
	public void setHouses(House[] houses) {
		this.houses = houses;
	}
	public Car[] getCars() {
		return cars;
	}
	public void setCars(Car[] cars) {
		this.cars = cars;
	}        
	
	
}

