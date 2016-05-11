package com.kozak.polymorphism;

/**
 *Class that is used to create an object of triangle
 * @author Orysia Kozak
 * @version 1.1
 */
public class Rectangle extends Figure{

	/**
	 * Initializing rectangle with the constructor of the superclass
	 * @param name sets the name of the figure
	 * @param sides sets an array of figure sides
	 * @param coordX places the figure on coordinate x
	 * @param coordY places the figure on coordinate y
	 */
	public Rectangle(String name, float[] sides, float coordX, float coordY) {
		super(name, sides, coordX, coordY);
		
	}

	/**Calculating the value of square of rectangle
	 * @return the value of square*/
	@Override
	public float getSquare() {
		
		float square = sides[0] * sides[2];
		
		return square;
	}

	
}
