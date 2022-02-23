package model;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Nguoi.quoctich = "Viet Nam";
		new Nguoi(); // tạo 1 đối tượng(instance)
		new Nguoi();
		Nguoi p1 = new Nguoi();                  // tạo 1 đối tượng sử dụng từ khóa new
		Nguoi p2 = new Nguoi();

		System.out.println(p1.quoctich);
		System.out.println(p2.quoctich);

		p2.quoctich = "China";
		System.out.println(p1.quoctich); // static dùng chung cho tất cả các đối tượng,
											// thay đổi 1 thằng thì các thằng khác cũng thay đổi
											// static dùng để mô phỏng các giá trị chung, ko dùng static để mô phỏng các
											// gtri riêng
		p1.ten = "A";
		p1.tuoi = 10;
		p1.gioitinh = "Nam";
		p2.ten = "B";
		p2.tuoi = 12;
		p2.gioitinh = "Nữ";
		System.out.println(p1.tuoi);
		System.out.println(p1.ten);
		System.out.println(p1.gioitinh);
		System.out.println(p2.ten);                   //những thuộc tính ko có static sẽ độc lập với từng đối tượng
		
		
		
		                                                 //biến n-static phải tạo đối tượng trước khi gọi
		
		
		
		System.out.println("nhap thong tin p1 ");
		p1.input();
		System.out.println("nhap thong tin p2 ");
		p2.input();
		System.out.println("p1 va p2 lan luot la ");
		p1.info();
		p2.info();
				
		Nguoi p3 = new Nguoi(111);
		Nguoi p4 = new Nguoi("Dungnv113");
	}

}


