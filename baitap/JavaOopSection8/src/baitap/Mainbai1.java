package baitap;

public class Mainbai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.input();
		House[] houses = new House[2];
		Car[] cars = new Car[2];
		for (int i = 0; i < houses.length; i++) {
			houses[i] = new House();
			houses[i].input();
			houses[i].setOwner(person);
			;
		}
		for (int j = 0; j < cars.length; j++) {
			cars[j] = new Car();
			cars[j].input();
			cars[j].setOwner(person);
		}
		for (int i = 0; i < houses.length; i++) {
			houses[i].info();
			houses[i].getOwner().info();
		}
		for (int i = 0; i < houses.length; i++) {
			cars[i].info();
			cars[i].getOwner().info();

		}
	}
}
