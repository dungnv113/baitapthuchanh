package baitap2;

import java.util.Scanner;

public class Nation {
private String nationName;

public String getNationName() {
	return nationName;
}

public void setNationName(String nationName) {
	this.nationName = nationName;
}

public void input() {
	System.out.println("nationName: ");
	Scanner scNName = new Scanner(System.in);
	nationName = scNName.nextLine();

}

public void info() {

	System.out.println(nationName);
}
}
