 package model;

public class Student extends Person {
	private String studentClass;
	private Laptop[] laptops;

	public void input() {
		// TODO Auto-generated method stub
		super.intput();
	}

	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println(studentClass);
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

}
