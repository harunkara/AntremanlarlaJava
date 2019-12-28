package circle;

public abstract class Circle {
	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setArea(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public String toString() {
		return "area:"+getArea();
	}
	
	

}
