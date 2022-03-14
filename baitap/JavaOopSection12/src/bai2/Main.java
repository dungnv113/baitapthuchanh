package bai2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			chia(2, 0);

		} catch (ZeroException e) {
			// TODO: handle exception
			System.out.println(e.getError());
		}
	}

	public static void chia(int a, int b) throws ZeroException {
		try {
			int kq = a / b;
			System.out.println("ket qua la: ");
			System.out.println(kq);

		} catch (Exception e) {
			// TODO: handle exception
			throw new ZeroException("nhap lai:" + e);

		}
	}
}
