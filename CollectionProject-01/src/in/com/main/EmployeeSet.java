package in.com.main;

import java.util.Set;
import java.util.TreeSet;

import in.com.entity.Employee;

public class EmployeeSet {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>();
		set.add(new Employee("Bharat", 21, 1005, 25000));
		set.add(new Employee("Bapun", 22, 1008, 30000));
		set.add(new Employee("Rahul", 25, 1001, 10000));
		set.add(new Employee("Akhil", 21, 1002, 20000));

		System.out.println("\n*********************************************************");
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
		
		System.out.println("*********************************************************");
		
	}
}
