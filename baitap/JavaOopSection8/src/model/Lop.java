package model;

import java.util.Scanner;

public class Lop {
	private String tenLop;
	private int soluongSV;
	
	private MonHoc monHoc;
	
	private Student[] students;
	public void input() {
		System.out.println("tenLop: ");
		Scanner scTL = new Scanner(System.in);
		tenLop = scTL.nextLine();
		System.out.println("soluongSV: ");
		Scanner scSv = new Scanner(System.in);
		soluongSV = scSv.nextInt();

	 }
	public void info() {
		System.out.println(soluongSV);
		System.out.println(tenLop);
		
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public int getSoluongSV() {
		return soluongSV;
	}

	public void setSoluongSV(int soluongSV) {
		this.soluongSV = soluongSV;
	}

	public MonHoc getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	 
}
