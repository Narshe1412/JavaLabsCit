package lab1part2;

public class TestCircleClass {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has a radius of " + c1.getRadius() 
		+ " and an area of " + c1.getArea());
		
		Circle c2 = new Circle(2.0);
		System.out.println("This other circle has a radius of " + c2.getRadius() 
		+ " and an area of " + c2.getArea() + " and color " + c2.getColor());
		
		Circle c3 = new Circle(3.0, "blue");
		System.out.println("The third circle has a radius of " + c3.getRadius() 
		+ " and an area of " + c3.getArea() + " a color of " +  c3.getColor());
		
		c3.setColor("pine");
		c3.setRadius(5);
		
		System.out.println("Now, the third circle has a radius of " + c3.getRadius() 
		+ " and an area of " + c3.getArea() + " a color of " +  c3.getColor());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c2);
		
	}
	
	

}
