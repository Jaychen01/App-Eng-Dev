package Assignment4.Q1;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void getArea() {
		System.out.println(3.14 * this.radius * this.radius);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println (2 * 3.14 * this.radius);
	}
	
}
