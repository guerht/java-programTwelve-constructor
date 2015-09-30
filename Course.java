/*
 * Project: Course.java
 * Description: A course constructor
 * Author: Seunghoon Park
 * Date: 30 September, 2015
 */
public class Course {
	private String name; // cannot be accessed from outside this class
	public Course() {
		this.name = "";
	}
	public Course(String n) {
		this.name = n;
	}
	public String getName() {
		return name; 
	}
	public void setName(String n) {
		this.name = n;
	}
	public void printName() {
		System.out.println("Welcome to " + name);
	}
}