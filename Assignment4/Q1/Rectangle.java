package Assignment4.Q1;

public class Rectangle extends Shape{

	private double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		System.out.println(this.width * this.height);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println(2*(this.width+this.height));
	}

}
