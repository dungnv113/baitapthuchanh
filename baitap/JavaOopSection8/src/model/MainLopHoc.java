package model;

public class MainLopHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonHoc cnpm = new MonHoc();
		cnpm.setTenMonHoc("CNPM");

		Lop[] danhsachLop = new Lop[2];
		System.out.println("input lop: ");
		for (int i = 0; i < danhsachLop.length; i++) {
			danhsachLop[i] = new Lop();
			danhsachLop[i].input();
			danhsachLop[i].setMonHoc(cnpm);
		}
		System.out.println("info lop: ");
		for (int i = 0; i < danhsachLop.length; i++) {
			danhsachLop[i].info();
			System.out.println(danhsachLop[i].getMonHoc().getTenMonHoc());
			     //danhsachLop[i].getMonHoc().getTenMonHoc();
		}
	}

}
