// Superclass
package in.com.assignment2;

class Animal {

	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Dog extends Animal {
	// Override makeSound() method for Dog
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}
}

class Cat extends Animal {
	// Override makeSound() method for Cat
	@Override
	public void makeSound() {
		System.out.println("The cat meows.");
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		// Create objects of each class
		Animal genericAnimal = new Animal();
		Dog myDog = new Dog();
		Cat myCat = new Cat();

		// Display sounds
		System.out.println("Generic Animal Sound:");
		genericAnimal.makeSound();

		System.out.println("\nDog Sound:");
		myDog.makeSound();

		System.out.println("\nCat Sound:");
		myCat.makeSound();
	}
}
