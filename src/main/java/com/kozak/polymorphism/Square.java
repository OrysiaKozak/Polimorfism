package com.kozak.polymorphism;

/**
 * Class is used to create an object of square
 * @author Orysia Kozak
 * @version 1.1
 */
public class Square extends Rectangle{

	/**
	 * Initializing square with the constructor of the superclass
	 * @param name sets the name of the figure
	 * @param sides sets an array of figure sides
	 * @param coordX places the figure on coordinate x
	 * @param coordY places the figure on coordinate y
	 */
	public Square(String name, float[] sides, float coordX, float coordY) {
		super(name, sides, coordX, coordY);
		
	}

	/**Calculating the value of square of square figure
	 * @return the value of square*/
	public float getSquare() {
		
		float square = sides[0] * sides[1];
		
		return square;
	}
}
