package in.com.question1;

public class MainApp {

	public static void main(String[] args) {

		GeometricShape triangle = new Triangle(20, 10);
		System.out.println("Area of Triangle is :: " + triangle.area());
		System.out.println("Perimeter of Triangle is :: " + triangle.perimeter());
		
		System.out.println("*********************************************************");
		
		GeometricShape square = new Square(10);
		System.out.println("Area of Square is :: " + square.area());
		System.out.println("Perimeter of Square is :: " + square.perimeter());

	}

}
