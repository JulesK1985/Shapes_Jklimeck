/**
 * 
 */
package edu.cvtc.java;

import edu.cvtc.java.shapes.*;

/**
 * @author Jules
 *
 */
public class ShapesTest 
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		// create 3 new shape objects (one of each)
		Shape cube = new Cuboid(3, 2, 3);
		Shape cylinder = new Cylinder(3, 7);
		Shape sphere = new Sphere(3);
		
		// call render method to print out dimensions in 3 dialog boxes
		cube.render();
		cylinder.render();
		sphere.render();

	}

}
