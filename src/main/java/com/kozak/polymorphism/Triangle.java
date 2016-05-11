package com.kozak.polymorphism;

/**
 *Class that is used to create an object of triangle
 * @author Orysia Kozak
 * @version 1.1
 */
public class Triangle extends Figure{

	/**
	 * Initializing triangle with the constructor of the superclass
	 * @param name sets the name of the figure
	 * @param sides sets an array of figure sides
	 * @param coordX places the figure on coordinate x
	 * @param coordY places the figure on coordinate y
	 */
	public Triangle(String name, float[] sides, float coordX, float coordY) {
		super(name, sides, coordX, coordY);
		
	}

	/**Calculating the value of square of triangle
	 * @return the value of square*/
	@Override
	public float getSquare() {
		
		float perimeter = 0;
		
		float subperimeter = perimeter/2;
		
		for (int i = 0; i < sides.length; i++) {
			
			perimeter += sides[i];
		}
		//formula Gerona
		float square = (float) Math.sqrt(subperimeter*(subperimeter - sides[0]) * (subperimeter - sides[1]) * (subperimeter - sides[2])); 
		
		return square;
	}

	
	
}
