package in.com.entities;

public class Student extends Person {

	private int rollNo;
	private int marks;
	private char grade;

	public Student() {
		super();
	}

	public Student(String name, int age, int rollNo, int marks, char grade) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
		this.grade = grade;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Student [Roll Number=" + rollNo + " Marks = " + marks + " Grade = " + grade + "]");
	}

}
