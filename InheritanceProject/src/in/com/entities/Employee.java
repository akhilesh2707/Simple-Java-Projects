package in.com.entities;

public class Employee extends Person {

	private int empId;

	public Employee() {
		super();
	}

	public Employee(String name, int age, int empId) {
		super(name, age);
		this.empId = empId;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Employee [Id = +"+empId+"]");
	}

}
