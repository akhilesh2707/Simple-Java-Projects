package in.com.question1;

public class Triangle extends GeometricShape {

	private float height;

	public Triangle() {

	}

	public Triangle(float side, float height) {
		super(side);
		this.height = height;
	}

	@Override
	public float area() {
		float area = (height * side) / 2;
		return area;
	}

	@Override
	public float perimeter() {
		float perimeter = side + side + side;
		return perimeter;
	}

}
