package baitap2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nation vn = new Nation();
		vn.input();
		Scanner Number = new Scanner(System.in);
		System.out.println("Vui long nhap n");
		int n = Number.nextInt();
		Person[] persons = new Person[n];
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].input();
			persons[i].setQuocTich(vn);
		}
		for (int i = 0; i < persons.length; i++) {
			persons[i].info();
			persons[i].getQuocTich().info();
		}

	}
}
