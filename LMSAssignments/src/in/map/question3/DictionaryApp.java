package in.map.question3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApp {

	public static void main(String[] args) {

		// Create a TreeMap to store word-definition pairs
		TreeMap<String, String> dictionary = new TreeMap<>();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nDictionary Application");
			System.out.println("1. Add Word-Definition Pair");
			System.out.println("2. Retrieve and Display Definition");
			System.out.println("3. Display All Word-Definition Pairs");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline

			switch (choice) {
			case 1:
				addWordDefinitionPair(dictionary, scanner);
				break;
			case 2:
				retrieveAndDisplayDefinition(dictionary, scanner);
				break;
			case 3:
				displayAllPairs(dictionary);
				break;
			case 4:
				System.out.println("Exiting the program. Goodbye!");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	// Method to add a word-definition pair to the dictionary
	private static void addWordDefinitionPair(TreeMap<String, String> dictionary, Scanner scanner) {
		System.out.println("Enter the word: ");
		String word = scanner.nextLine();

		System.out.println("Enter the definition: ");
		String definition = scanner.nextLine();

		// Add the word-definition pair to the dictionary
		dictionary.put(word, definition);
		System.out.println("Word-Definition pair added successfully!\n");
	}

	// Method to retrieve and display the definition of a specific word
	private static void retrieveAndDisplayDefinition(TreeMap<String, String> dictionary, Scanner scanner) {
		System.out.println("Enter the word to retrieve its definition: ");
		String wordToRetrieve = scanner.nextLine();

		// Retrieve and display the definition
		String definition = dictionary.get(wordToRetrieve);
		if (definition != null) {
			System.out.println("Definition of " + wordToRetrieve + ": " + definition + "\n");
		} else {
			System.out.println("Word not found in the dictionary.\n");
		}
	}

	// Method to display all word-definition pairs in alphabetical order
	private static void displayAllPairs(TreeMap<String, String> dictionary) {
		System.out.println("\nAll Word-Definition Pairs (Alphabetical Order)\n");
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
