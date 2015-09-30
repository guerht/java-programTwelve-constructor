/*
 * Project: Circle.java
 * Description: A circle object
 * Author: Seunghoon Park
 * Date: 30 September, 2015
 */
public class Circle {
	private double radius;
	public Circle() {
		radius = 0;
	}
	public Circle(double num) {
		this.radius = num;
	}
	public void setRadius(double num) {
		this.radius = num;
	}
	public double getRadius() {
		return radius;
	}
	public double getDiametre() {
		return radius *= 2;
	}
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	public double getCirc() {
		return 2 * radius * Math.PI;
	}
}