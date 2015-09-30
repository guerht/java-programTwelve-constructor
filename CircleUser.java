/*
 * Project: CircleUser.java
 * Description: Playing with the circle object
 * Author: Seunghoon Park
 * Date: 30 September, 2015
 */
public class CircleUser {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		c1.setRadius(10);
		System.out.println("Circle 1's radius is: " + c1.getRadius());
		System.out.println("Circle 1's diameter is: " + c1.getDiametre());
		System.out.println("Circle 1's circumference is: " + c1.getCirc());
		System.out.println("Circle 1's area " + c1.getArea());
		System.out.println("Circle 2's radius is: " + c2.getRadius());
		System.out.println("Circle 2's diameter is: " + c2.getDiametre());
		System.out.println("Circle 2's circumference is: " + c2.getCirc());
		System.out.println("Circle 2's area " + c2.getArea());
	}
}