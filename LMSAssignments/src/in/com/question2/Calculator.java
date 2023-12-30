package in.com.question2;

import java.util.Scanner;

public class Calculator {

	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// Method to add three integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method to add two doubles
	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Calculator calculator = new Calculator();

		System.out.print("Enter two integers for the first add method:\nFirst number: ");
		int num1 = scanner.nextInt();
		System.out.print("Second number: ");
		int num2 = scanner.nextInt();

		int result1 = calculator.add(num1, num2);
		System.out.println("Result of add(int, int): " + result1);

		System.out.print("\nEnter three integers for the second add method:\nFirst number: ");
		int num3 = scanner.nextInt();
		System.out.print("Second number: ");
		int num4 = scanner.nextInt();
		System.out.print("Third number: ");
		int num5 = scanner.nextInt();

		int result2 = calculator.add(num3, num4, num5);
		System.out.println("Result of add(int, int, int): " + result2);

		System.out.print("\nEnter two doubles for the third add method:\nFirst number: ");
		double num6 = scanner.nextDouble();
		System.out.print("Second number: ");
		double num7 = scanner.nextDouble();

		double result3 = calculator.add(num6, num7);
		System.out.println("Result of add(double, double): " + result3);

		scanner.close();
	}
}
