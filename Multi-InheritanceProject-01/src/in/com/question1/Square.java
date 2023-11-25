package in.com.question1;

public class Square extends GeometricShape {
	
	public Square() {
		
	}
	
	public Square(float side) {
		super(side);		
	}

	@Override
	public float area() {
		float area = side * side;
		return area;
	}

	@Override
	public float perimeter() {
		float perimeter = 4 * side;
		return perimeter;
	}

}
