package model;

import java.util.Scanner;

public class Laptop {
	private int price;
	private String model;
	
	private Student owner;
	
	public void input() {
		System.out.println("model: ");
		Scanner scMod = new Scanner(System.in);
		model = scMod.nextLine();
		System.out.println("price: ");
		Scanner scPri = new Scanner(System.in);
		price = scPri.nextInt();

	 }
	public void info() {
		System.out.println(price);
		System.out.println(model);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Student getOwner() {
		return owner;
	}
	public void setOwner(Student st) {
		this.owner = st;
	}
	
}
