package in.com.question1;

import java.util.Scanner;

public class Car {

	private String make;
	private String model;
	private short year;
	private int price;

	public Car(String make, String model, short year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter car details:");
		System.out.print("Make: ");
		String make = scanner.nextLine();

		System.out.print("Model: ");
		String model = scanner.nextLine();

		System.out.print("Year: ");
		short year = scanner.nextShort();

		System.out.print("Price: ");
		int price = scanner.nextInt();

		// Create a Car object using the provided details
		Car myCar = new Car(make, model, year, price);

		// Display the details of the created car
		System.out.println("\nCar Details:");
		System.out.println("Make: " + myCar.make);
		System.out.println("Model: " + myCar.model);
		System.out.println("Year: " + myCar.year);
		System.out.println("Price: Rs." + myCar.price);

		scanner.close();
	}
}
