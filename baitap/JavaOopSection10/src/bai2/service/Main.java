package bai2.service;

import bai2.Laptop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop();
		LaptopService laptopService = new LaptopServiceImpl();
		laptopService.input(laptop);
		laptopService.info(laptop);
	}

}
