package in.abstracts.question1;

abstract class Shape {

	public abstract void calculateArea();

}

class Circle extends Shape {

	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle is :: " + area);
	}

}

class Rectangle extends Shape {

	private float length;
	private float width;

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		double area = length * width;
		System.out.println("Area of Rectangle is :: " + area);
	}

}

public class AbstractMainApp1 {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		circle.calculateArea();

		System.out.println("*************************************");

		Rectangle rectangle = new Rectangle(36, 24);
		rectangle.calculateArea();

	}

}
