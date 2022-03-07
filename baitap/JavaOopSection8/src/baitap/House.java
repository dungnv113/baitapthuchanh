package baitap;

import java.util.Scanner;

public class House {
private int floor;
private Person owner;
public int getFloor() {
	return floor;
}

public void setFloor(int floor) {
	this.floor = floor;
}
public void input() {
	System.out.println("floor: ");
	Scanner scfl = new Scanner(System.in);
	floor = scfl.nextInt();

 }

public void info() {
	System.out.println(floor);
	
}

public Person getOwner() {
	return owner;
}

public void setOwner(Person owner) {
	this.owner = owner;
}
}
