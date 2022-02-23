package ontapoop3;

import java.util.Scanner;

public class CourseScore {
	int id;
	int score;
	String name;

	public void input() {
		System.out.println("nhap vao id cua hoc sinh ");
		id = new Scanner(System.in).nextInt();
		System.out.println("nhap score cua hoc sinh ");
		score = new Scanner(System.in).nextInt();
		System.out.println("nhap vao name cua hoc sinh ");
		name = new Scanner(System.in).nextLine();
	}

public void info() {
	System.out.println(id);
	if(score <5) {
		System.out.println("YEU");
	}
	else if(score >=5 && score <7){
		System.out.println("TB");
	}
	else if(score>=7 && score <8) {
		System.out.println("KHA");
	}
	else if(score>=8 && score <9) {
		System.out.println("GIOI");}
		else if (score>=9) {
			System.out.println("XUAT SAC");}
			
				
	System.out.println(name);
}

}
