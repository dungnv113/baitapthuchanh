package baitap2;

import java.util.Scanner;

public class Person {
	private String name;
	private Nation quocTich;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Nation getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(Nation quocTich) {
		this.quocTich = quocTich;
	}

	public void input() {
		System.out.println("name: ");
		Scanner scName = new Scanner(System.in);
		name = scName.nextLine();

	}

	public void info() {

		System.out.println(name);
	}
}
