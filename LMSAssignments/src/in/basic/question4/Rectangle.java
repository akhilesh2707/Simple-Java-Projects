package in.basic.question4;

public class Rectangle {

	private double width;
	private double height;

	enum Color {
		RED, GREEN, BLUE
	}

	private Color boxColor;

	public Rectangle(double width, double height, Color boxColor) {
		this.width = width;
		this.height = height;
		this.boxColor = boxColor;
	}

	public static void main(String[] args) {
		System.out.println(Color.BLUE);
	}
}
