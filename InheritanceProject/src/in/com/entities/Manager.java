package in.com.entities;

public class Manager extends PermanentEmployee {

	private float HRA;
	private float DA;
	private float insentive;

	public Manager() {
		super();
	}

	public Manager(String name, int age, int empId, String department, float basicSalary, float HRA, float DA,
			float insentive) {
		super(name, age, empId, department, basicSalary);
		this.HRA = HRA;
		this.DA = DA;
		this.insentive = insentive;
	}

	@Override
	public float calculateSalary() {
		return super.calculateSalary() + HRA + DA + insentive;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Manager [HRA = + " + HRA + " DA = +" + DA + "Insentive = +" + insentive + "]");
	}

}
