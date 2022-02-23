package ontapoop2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st1 = new Student();
Teacher tc1 = new Teacher();
System.out.println("nhap thong tin hoc sinh: ");
st1.input();
System.out.println("hoc sinh 1 la: ");
st1.info();

System.out.println("nhap thong tin giao vien: ");
tc1.input();
System.out.println("sinh vien 1 la: ");
tc1.info();

	}


}
