package baitap;

import java.util.Scanner;

public class Car {
private String color;
private Person owner;

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
public void input() {
	System.out.println("color: ");
	Scanner sccl = new Scanner(System.in);
	color = sccl.nextLine();

 }

public Person getOwner() {
	return owner;
}

public void setOwner(Person owner) {
	this.owner = owner;
}

public void info() {
	System.out.println(color);
	
}
}
