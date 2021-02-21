package Assignment4.Q1;

public class Shape {

	private String name;
	private double perimeter;
	private double area;
	
	public void getPerimeter() {
		
		System.out.println(perimeter);
	}
		
	public void getArea() {
		
		System.out.println(area);
	}
			
	public void draw() {
		
		System.out.println("Drawing " + this.getClass().getSimpleName());
		
	}

}

