package Bai1;

public class Person {
	private int id;
	private String name;
	private int age;

	public Person() {

	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			if (((Person) obj).getAge() == this.age) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}
}
