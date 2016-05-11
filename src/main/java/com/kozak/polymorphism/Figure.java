package com.kozak.polymorphism;

import java.util.Arrays;

/**
 * Sets a specific behavior for it's inheritors
 * @author Orysia Kozak
 * @version 1.1
 */
public abstract class Figure {

	/**
	 * Creates a name of the figure
	 */
	protected String name;

	/**
	 * Creates an array of sides of the figure
	 */
	protected float[] sides;

	/**
	 * Sets placements of figure on coordinate x
	 */
	protected float coordX;

	/**
	 * Sets placement of figure on coordinate y
	 */
	protected float coordY;
	
	/**Initialization of figure object
	 * @param name sets the name of the figure
	 * @param sides sets an array of figure sides
	 * @param coordX places the figure on coordinate x
	 * @param coordY places the figure on coordinate y
	 */
	public Figure(String name, float[] sides, float coordX, float coordY) {
		super();
		this.name = name;
		this.sides = sides;
		this.coordX = coordX;
		this.coordY = coordY;
	}

	/**Calculating value of square of the figure
	 * @return value of square*/
	public abstract float getSquare();
	
	/**
	 * Returns information about the figure
	 */
	public void show() {
		System.out.println(toString());
	}

	/**
	 *Changes coordinates of figure
	 *@param coordX changes the place of the figure on coordinate x
	 *@param coordY changes the place of the figure on coordinate y 
	 */
	public void replace(float coordX, float coordY){
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	/**Zooming figure by x times
	 * @param x the number by what figure will be zoomed
	 * */
	public void zoom(double x){
		
		for (int i = 0; i < sides.length; i++) {
			sides[i]*=x;
		}
	}

	/**Shows information about figure
	 *@return values of all fields of the figure*/
	@Override
	public String toString() {
		return "Figure [name=" + name + ", sides=" + Arrays.toString(sides)
				+ ", coordX=" + coordX + ", coordY=" + coordY + "]";
	}
	
	
}
