package Assignment4.Q1;

public class Square extends Shape{
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void getArea() {
		System.out.println(this.side * this.side);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println (4 * this.side);
	}
	
}
