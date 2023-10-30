package in.com.entities;

public class Person {

	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void printDetails() {
		System.out.println("Person [Name=" + name + ", Age=" + age + "]");
	}

}
