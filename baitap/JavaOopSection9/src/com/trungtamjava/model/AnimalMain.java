package com.trungtamjava.model;

import java.util.Scanner;

public class AnimalMain {


	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Dog");
			System.out.println("2. Chicken");
			

			Scanner scChoose = new Scanner(System.in);
			System.out.println("chon: ");
			int Choose = scChoose.nextInt();

			if (Choose == 1) {
				Dog();
				break;
			} else if (Choose == 2) {
				Chicken();
				break;
			} else {
				System.out.println("chon lai: ");
			}
		}
	}
	public static void Dog() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong Dog");
		int DogNum = scanner.nextInt();

		Animal[] dogs = new Dog[DogNum];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			input(dogs[i]);

		}

		for (int i = 0; i < dogs.length; i++) {
			info(dogs[i]);
		}
	}
	public static void Chicken() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong Chicken");
		int n = scanner.nextInt();

		Animal[] chickens = new Chicken[n];

		for (int i = 0; i < chickens.length; i++) {
			chickens[i] = new Chicken();
			input(chickens[i]);
		}

		for (int i = 0; i < chickens.length; i++) {
			info(chickens[i]);
		}
	}
	public static void input(Animal animal) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Name ");
		animal.setName(scanner.nextLine());

		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("Nhap color cua Dog");
			String Color = scanner.nextLine();
			dog.setColor(Color);
		}
		if (animal instanceof Chicken) {
			Chicken chicken = (Chicken) animal;
			System.out.println("Nhap age cua Chicken");
			int age= scanner.nextInt();
			chicken.setAge(age);
		}

	}
	public static void info(Animal animal) {
		System.out.println("name " + animal.getName());
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("COLOR: " + " " + dog.getColor());
		}
		if (animal instanceof Chicken) {
			Chicken chicken = (Chicken) animal;
			System.out.println("AGE: " + chicken.getAge());
		}
	}

}
