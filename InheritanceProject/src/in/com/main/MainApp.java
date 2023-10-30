package in.com.main;

import in.com.entities.Developer;
import in.com.entities.Employee;
import in.com.entities.FreeLancer;
import in.com.entities.Manager;
import in.com.entities.PermanentEmployee;
import in.com.entities.Person;
import in.com.entities.SalesExecutive;
import in.com.entities.Student;

public class MainApp {

	public static void main(String[] args) {

		PermanentEmployee manager = new Manager("Krishna Rao", 26, 1001, "Manager", 30000, 8000, 6000, 4000);  //Promoting Loose Coupling
		System.out.println("Salary of Manager : " + manager.calculateSalary());
		manager.printDetails();

		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		PermanentEmployee salesExecutive = new SalesExecutive("Rohit Mahra", 30, 1002, "Sales Executive", 28000, 7000,
				5000, 3000);
		System.out.println("Salary of Sales Executive : " + salesExecutive.calculateSalary());
		salesExecutive.printDetails();
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		PermanentEmployee developer = new Developer("Rakesh Jha", 25, 1003, "Developer", 25000, 4000);
		System.out.println("Salary of Developer : " + developer.calculateSalary());
		developer.printDetails();
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

		Employee freeLancer = new FreeLancer("Raj Malhotra", 29, 1004, 45, 1700);
		System.out.println("Salary of FreeLancer : " + ((FreeLancer) freeLancer).calculateSalary());  //Down Casting Employee to FreeLancer
		freeLancer.printDetails();

		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		Person student = new Student("Sonu Sharma", 22, 8665, 80, 'A');
		student.printDetails();
		
	}

}
