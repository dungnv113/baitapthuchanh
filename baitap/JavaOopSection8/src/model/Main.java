package model;

import model.Laptop;
import model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student duy = new Student();
		duy.input();
		Student duong = new Student();
		duong.input();
		Laptop asus = new Laptop();
		asus.input();
		Laptop acer = new Laptop();
		acer.input();		
		asus.setOwner(duy); 
		acer.setOwner(duong);
		System.out.println("INFO ");
		asus.info();
		asus.getOwner().info();
	}

}
