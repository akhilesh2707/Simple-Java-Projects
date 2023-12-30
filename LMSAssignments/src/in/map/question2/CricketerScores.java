package in.map.question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {

	public static void main(String[] args) {

		Map<String, Integer> cricketerScores = new HashMap<>();

		// Populate the Map with some sample data
		cricketerScores.put("Virat Kohli", 70);
		cricketerScores.put("Rohit Sharma", 102);
		cricketerScores.put("Shikhar Dhawan", 45);
		cricketerScores.put("KL Rahul", 89);

		// Prompt the user to enter a cricketer's name
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the cricketer's name to search: ");
		String cricketerName = scanner.nextLine();

		// Search for the cricketer's name in the Map
		if (cricketerScores.containsKey(cricketerName)) {
			// Display the cricketer's score if found
			int score = cricketerScores.get(cricketerName);
			System.out.println(cricketerName + "'s score is: " + score);
		} else {
			// Display a message if the cricketer's name is not found
			System.out.println("Cricketer not found in the list.");
		}

		scanner.close();
	}
}
