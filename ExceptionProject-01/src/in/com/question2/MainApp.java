package in.com.question2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		int enterNumber;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number :: ");
		enterNumber = scanner.nextInt();

		try {
			checkForOdd(enterNumber);
		} catch (ContainOddNumberException e) {
			System.out.println(e);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

	private static void checkForOdd(int enterNumber) throws ContainOddNumberException {
		if (enterNumber % 2 != 0) {
			throw new ContainOddNumberException("The entered number is odd.");
		} else {
			System.out.println("Your Entered Number is :: " + enterNumber);
		}
	}

}
