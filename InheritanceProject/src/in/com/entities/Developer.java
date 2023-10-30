package in.com.entities;

public class Developer extends PermanentEmployee {

	private float DA;

	public Developer() {
		super();
	}

	public Developer(String name, int age, int empId, String department, float basicSalary, float DA) {
		super(name, age, empId, department, basicSalary);
		this.DA = DA;
	}

	@Override
	public float calculateSalary() {
		return super.calculateSalary() + DA;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Developer [DA = " + DA + "]");
	}

}
