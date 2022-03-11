package enum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodMenu[] fms = new FoodMenu();
		FoodMenu[] foodMenus = FoodMenu.values();

		for (int i = 0; i < foodMenus.length; i++) {
			System.out.println(fms[i].getId());
			System.out.println(fms[i].getTen());
		}
	}

}
