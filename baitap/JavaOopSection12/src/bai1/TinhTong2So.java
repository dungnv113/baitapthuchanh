package bai1;

import java.util.Scanner;

public class TinhTong2So {

	public static void main(String[] args) {
		while (true) {
			// TODO Auto-generated method stub
			try {
				System.out.println("nhap vao x: ");
				Scanner sc1 = new Scanner(System.in);
				int x = sc1.nextInt();

				System.out.println("nhap vao y: ");
				Scanner sc2 = new Scanner(System.in);
				int y = sc2.nextInt();

				int sum = x + y;
				System.out.println("tong 2 so x va y: " + sum);
				break;
			} catch (Exception e) {
				// TODO: handle exceptionsy
				System.out.println("nhap lai:");
			}

		}

	}
}