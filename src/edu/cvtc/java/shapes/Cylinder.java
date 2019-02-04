/**
 * 
 */
package edu.cvtc.java.shapes;

import javax.swing.JOptionPane;

import edu.cvtc.java.Shape;

/**
 * @author Jules
 *
 */
//Class for Cylinder which inherits from Shape
public class Cylinder extends Shape {
	
	// variables for radius and height, set to 0.0
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	
	// getters and setters for radius and height
	private void setRadius(float radius) {
		
		this.radius = radius;
	}
	
	public float getRadius() {
		
		return radius;
	}

	private void setHeight(float height) {
		
		this.height = height;
	}
	
	public float getHeight() {
		
		return height;
	}
	
	// Cylinder constructor, passing in radius and height
	public Cylinder(float radius, float height) {
		
		setRadius(radius);
		setHeight(height);
	}
	
	// override surfaceArea() with the correct calculations for this shape
	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * getRadius() *(getRadius() + getHeight()));
	}
	
	// override volume() with the correct calculations for this shape
	@Override
	public float volume() {
		return (float) (Math.PI * getRadius() * getHeight());
	}
	
	/* 
	 * Override render() to check if the values are > 0. 
	 * If they are < = 0, display a dialog box alerting the user this shape's measurements are wrong
	 * If they are > 0, display a dialog box with the shape's surface area and volume.
	 */
	@Override
	public void render() {
		if (surfaceArea() > 0 && volume() > 0  ) {
			JOptionPane.showMessageDialog(null, "Cylinder dimensions: \nSurface Area: " + surfaceArea() +"\nVolume: " + volume());
			
			}else {
				JOptionPane.showMessageDialog(null, "One of the Cylinder's dimensions are incorrect, measurements must be greater than 0");
			}
	}

}
