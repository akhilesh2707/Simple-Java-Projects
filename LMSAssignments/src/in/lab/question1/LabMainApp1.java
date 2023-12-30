package in.lab.question1;

import java.util.Scanner;

public class LabMainApp1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any two number :: ");
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();

		System.out.println("Enter (*) for Multiplication");
		System.out.println("Enter (/) for Division");
		System.out.println("Enter (+) for Addition");
		System.out.println("Enter (-) for Subtraction");
		System.out.println("Enter (%) for Remainder");
		System.out.println("Enter any one operator :: ");
		char operator = scanner.next().charAt(0);

		switch (operator) {

		case '*':
			System.out.println("Multiplication is :: " + (number1 * number2));
			break;
		case '/':
			if (number2 != 0) {
				System.out.println("Division is :: " + (number1 / number2));
				break;
			} else {
				throw new ArithmeticException("Number cannot divide by zero, Please enter a valid denominator.");
			}

		case '+':
			System.out.println("Addition is :: " + (number1 + number2));
			break;

		case '-':
			System.out.println("Substraction is :: " + (number1 - number2));
			break;

		case '%':
			System.out.println("Remainder is :: " + (number1 % number2));
			break;

		default:
			System.out.println("Invalid Operator Input!...");

		}

		scanner.close();

	}

}
