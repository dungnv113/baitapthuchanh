package model;

import java.util.Scanner;

public class LapTop {
static String nhasanxuat;
String mausac;
String ten;
String thuonghieu;

public void thongtin() {
	System.out.println(nhasanxuat);
	System.out.println(mausac);
	System.out.println(ten);
	System.out.println(thuonghieu);
}

public void nhapdulieu() {
	System.out.println("nhap nha san xuat");
	nhasanxuat = new Scanner(System.in).nextLine();
	System.out.println("mau sac");
	mausac = new Scanner(System.in).nextLine();
	System.out.println("nhap ten");
	ten = new Scanner(System.in).nextLine();
	System.out.println("nhap thuong hieu");
	thuonghieu = new Scanner(System.in).nextLine();
	
}

}
