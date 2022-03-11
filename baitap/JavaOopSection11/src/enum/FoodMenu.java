package enum;

public enum FoodMenu {
	CAFE(1, "Cafe"), MILK_TEA(2, "Milk Tea");
private int id;
private String ten;
private FoodMenu(int id, String ten) {
	
	this.id = id;
	this.ten = ten;
}
public int getId() {
	return id;
}

public String getTen() {
	return ten;
}

}
