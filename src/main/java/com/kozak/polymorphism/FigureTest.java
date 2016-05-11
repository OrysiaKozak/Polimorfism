package com.kozak.polymorphism;

/** Class that is used to test Figure objects on their behavior
 * @author Orysia Kozak
 * @version 1.1
 */
public class FigureTest {

	/**Main method that starts the program
	 * @param args given array of arguments*/
	public static void main(String[] args) {
		Figure figure = null;// basic condition of object
		
		float [] sidesOfSquare = {3,3,3,3};
		figure = new Square("square", sidesOfSquare, 34, 99);
		
		System.out.println("Information about figure before changes :");
		figure.show();
		figure.replace(22, 22);
		figure.zoom(10);
		System.out.println("Information after given changes :");
		figure.show();		
		System.out.println();
		
		float [] sidesOfTriangle = {15,22,25};
		figure = new Triangle("triangle", sidesOfTriangle, 45, 55);
		
		System.out.println("Information about figure before changes :");
		figure.show();
		figure.replace(12, 12);
		figure.zoom(5);
		System.out.println("Information after given changes :");
		figure.show();
		System.out.println();
		
		float [] sidesOfRectungle = {15,10,15,10};
		figure = new Rectangle("rectungle", sidesOfRectungle, 66, 88);
		
		System.out.println("Information about figure before changes :");
		figure.show();
		figure.replace(12, 12);
		figure.zoom(5);
		System.out.println("Information after given changes :");
		figure.show();
	}
}
