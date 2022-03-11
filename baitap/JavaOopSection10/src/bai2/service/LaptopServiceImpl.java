package bai2.service;

import java.util.Scanner;

import bai2.Laptop;

public class LaptopServiceImpl implements LaptopService {

	public void input(Laptop lt) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Vui long nhap ID");
		lt.setId(scan1.nextInt());

		Scanner scan2 = new Scanner(System.in);
		System.out.println("Vui long nhap CPU");
		lt.setCpu(scan2.nextLine());

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Vui long nhap Ram");
		lt.setRam(scan3.nextLine());

		Scanner scan4 = new Scanner(System.in);
		System.out.println("Vui long nhap VGA");
		lt.setVga(scan4.nextLine());

	}



	// TODO Auto-generated method stub
	public void info(Laptop lt) {
		System.out.println(lt.getId());
		System.out.println(lt.getCpu());
		System.out.println(lt.getRam());
		System.out.println(lt.getVga());
	}
	
}
