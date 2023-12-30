package in.abstracts.question2;

class Animal {

	public void makeSound() {
		System.out.println("The animal makes a sound");
	}

}

class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}

}

class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("The cat meows");
	}

}

public class MultiLevelMainApp2 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.makeSound();

		Dog dog = new Dog();
		dog.makeSound();

	}

}
