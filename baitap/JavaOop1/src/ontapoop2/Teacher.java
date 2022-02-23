package ontapoop2;

import java.util.Scanner;

public class Teacher {
int id;
String name;
String address;
String facility;

public void input() {
	System.out.println("nhap vao thong tin id cua giao vien ");
	id = new Scanner(System.in).nextInt();
	System.out.println("nhap vao thong tin id cua giao vien ");
	name = new Scanner(System.in).nextLine();
	System.out.println("nhap vao thong tin id cua giao vien");
	address = new Scanner(System.in).nextLine();
	System.out.println("nhap vao thong tin id cua giao vien ");
	facility = new Scanner(System.in).nextLine();
	

	
}

public void info() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	System.out.println(facility);
}

}
