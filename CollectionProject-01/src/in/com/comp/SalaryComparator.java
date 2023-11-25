package in.com.comp;

import java.util.Comparator;

import in.com.entity.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpSalary() > e2.getEmpSalary())
			return 1;
		else if(e1.getEmpSalary() < e2.getEmpSalary())
			return -1;
		else
		 return 0;
	}

}
