package in.map.question1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> studentAges = new HashMap<>();

		// Add key-value pairs to the HashMap
		studentAges.put("Sohit", 20);
		studentAges.put("Rohan", 22);
		studentAges.put("Abhay", 19);
		studentAges.put("Karan", 21);

		// Display the contents of the HashMap
		System.out.println("Student Details");
		System.out.println("********************");
		for (Map.Entry<String, Integer> entry : studentAges.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + ": " + age + " years old");
		}
	}
}
