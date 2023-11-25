package in.com.question1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		String inputText;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String :: ");
		inputText = scanner.nextLine();

		try {
			checkForVowels(inputText);
			System.out.println("The Enter Text is :: " + inputText);
		} catch (ContainVowelException e) {
			// System.out.println("ContainVowelException: " + e.getMessage());
			System.out.println(e);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

	/*
	 * private static void checkForVowels(String str) throws ContainVowelException {
	 * // Check if the string contains any vowels (a, e, i, o, u) if
	 * (!str.toLowerCase().matches(".*[aeiou].*")) { throw new
	 * ContainVowelException("The string does not contain any vowels."); } }
	 */

	private static void checkForVowels(String str) throws ContainVowelException {
		String lowercaseStr = str.toLowerCase();
		boolean containsVowel = false;

		// Check if the string contains any vowels (a, e, i, o, u)
		for (char c : lowercaseStr.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				containsVowel = true;
				break;
			}
		}

		if (containsVowel) {
			throw new ContainVowelException("The string contain vowels.");
		}
	}

}
