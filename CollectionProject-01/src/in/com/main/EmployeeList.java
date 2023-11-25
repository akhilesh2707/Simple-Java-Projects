package in.com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.com.comp.NameComparator;
import in.com.comp.SalaryComparator;
import in.com.entity.Employee;
import in.com.entity.Person;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Rahul", 25, 1001, 10000));
		list.add(new Employee("Akhil", 21, 1002, 20000));
		list.add(new Employee("Bharat", 21, 1005, 25000));
		list.add(new Employee("Bapun", 22, 1008, 30000));
		
		System.out.println("***********Before Sorting According to Name**************");
		for(Person person: list) {
			System.out.println(person);
		}
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("***********After Sorting According to Name**************");
		for(Person person: list) {
			System.out.println(person);
		}
		
		System.out.println("***********Before Sorting According to Salary**************");
		for(Person person: list) {
			System.out.println(person);
		}
		
		Collections.sort(list, new SalaryComparator());
		
		System.out.println("***********After Sorting According to Salary**************");
		for(Person person: list) {
			System.out.println(person);
		}

	}

}
