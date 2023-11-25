package in.com.question1;

public abstract class GeometricShape {
	
	protected float side;
	
	public GeometricShape() {
		
	}
	
	public GeometricShape(float side) {
		this.side = side;
	}
	
	public abstract float area();
	
	public abstract float perimeter();

}
