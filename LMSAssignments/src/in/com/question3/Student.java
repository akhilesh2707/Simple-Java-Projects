package in.com.question3;

public class Student {

	private String name;
	private int age;
	private String department;

	public Student(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	// Getter and Setter methods for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter methods for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter and Setter methods for department
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static void main(String[] args) {
		System.out.println("This is student class.");
	}

}
