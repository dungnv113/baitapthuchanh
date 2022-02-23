package ontapoop2;

import java.util.Scanner;

public class Student {
int id;
String name;
String address;
String major;
String constructor;


public void input() {
	System.out.println("nhap vao thong tin id cua hoc sinh ");
	id = new Scanner(System.in).nextInt();
	System.out.println("nhap vao thong tin name cua hoc sinh ");
	name = new Scanner(System.in).nextLine();
	System.out.println("nhap vao thong tin address cua hoc sinh ");
	address = new Scanner(System.in).nextLine();
	System.out.println("nhap vao thong tin major cua hoc sinh ");
	major = new Scanner(System.in).nextLine();
	System.out.println("nhap vao thong tin constructor cua hoc sinh ");
	constructor = new Scanner(System.in).nextLine();

}

public void info() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	System.out.println(major);
	System.out.println(constructor);
	
}

}
