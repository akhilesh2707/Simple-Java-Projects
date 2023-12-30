package in.basic.question2;

public class Employee {

	// int age = 35.5;
	protected int id, age;
	protected String name;
	protected boolean isParmanent;

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println("IS Employee Parmanent :: " + employee.isParmanent);
		System.out.println("Successfully Started!..");

	}

}
