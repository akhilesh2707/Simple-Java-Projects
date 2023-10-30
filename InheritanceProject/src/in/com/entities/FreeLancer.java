package in.com.entities;

public class FreeLancer extends Employee {
	
	private float noOfHours;
	private float ratePerHour;
	
	public FreeLancer() {
		super();
	}

	public FreeLancer(String name, int age, int empId, float noOfHours, float ratePerHour) {
		super(name, age, empId);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}
	
	public float calculateSalary() {
		return noOfHours * ratePerHour;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println(
				"FreeLancer [No of Hours Worked = " + noOfHours + " Worked Rate per Hour = " + ratePerHour + "]");
	}

}
