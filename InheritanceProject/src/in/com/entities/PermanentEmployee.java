package in.com.entities;

public class PermanentEmployee extends Employee {

	private String department;
	private float basicSalary;

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(String name, int age, int empId, String department, float basicSalary) {
		super(name, age, empId);
		this.department = department;
		this.basicSalary = basicSalary;
	}

	public float calculateSalary() {
		return basicSalary;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Employee [Department = " + department + " + Basic Salary = +" + basicSalary + "]");
	}

}
