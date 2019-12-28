package circle;

public class Cylinder extends Circle {
	public double height;

	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
		
	}

	public double getHeight() {
		return height;
	}
public double getVolume() {
	return height*getArea();
}
public double getArea() {
	return 3.14*2*height*radius;
}
public String toString() {
	return "Cylinder[height="+height+",Circle[radius:"+radius+"]]"+"\n"+"additionis:"+getArea();
}
	

}
