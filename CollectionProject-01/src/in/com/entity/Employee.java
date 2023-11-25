package in.com.entity;

public class Employee extends Person implements Comparable<Employee>{

	private int empId;
	private float empSalary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, int empId, float empSalary) {
		super(name, age);
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmpId= " + empId + "\tEmpName= " + super.name + "\t  EmpAge= " + super.age + "\tEmpSalary= "
				+ empSalary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(this.empId > e.empId) 
			return 1;
		else if(this.empId < e.empId)
			return -1;
		else
			return 0;
	}

}
