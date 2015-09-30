/*
 * Project: CourseUser.java
 * Description: A course constructor
 * Author: Seunghoon Park
 * Date: 30 September, 2015
 */
public class CourseUser {
	public static void main(String args[]) {
		Course algebra = new Course();
		System.out.println();
		algebra.printName();
		algebra.setName("Algebra");
		algebra.printName();
		Course geo = new Course("Geometry");
		geo.printName();
		Course trig = new Course("Trigonometry");
		Course calc = new Course();
		calc.setName("Calculus 1A");
		System.out.println("You must do " + algebra.getName() + ", " + geo.getName() + ", " + trig.getName() + " before doing " + calc.getName() + ".");
		
	}
}