package model;

import java.util.Scanner;

public class Nguoi {

	int tuoi;
	String ten;
	String gioitinh;
	static String quoctich; // biến, hàm có chữ static sẽ dùng chung cho tất cả các đối tượng.

	public Nguoi() {
		System.out.println("cai minh tao ra");                   // mục đích constructor để tạo đối tượng
	} 

	public Nguoi(int tuoi) {
		System.out.println("thiet lap tuoi");                       // khi đã khai báo constructor thì phải dùng cái constructor đã khai báo, ko dùng được cái mặc định
		this.tuoi = tuoi;
	}
	
	public Nguoi(String ten) {
		System.out.println("thiet lap ten");
		this.ten = ten;
	}
	

	public void info() {                        // ko có static, vì các biến ten, tuoi, gioi tinh, quoc tich là các biến n-static
							                                                                                        
		System.out.println(ten);
		System.out.println(tuoi);
		System.out.println(gioitinh);
		System.out.println(quoctich);

	}

	public void input() {
		System.out.println("nhap ten");
		ten = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		tuoi = new Scanner(System.in).nextInt();
		System.out.print("nhap gioi tinh");
		gioitinh = new Scanner(System.in).nextLine();
		System.out.println("nhap quoc tich");
		quoctich = new Scanner(System.in).nextLine();
	}
}
