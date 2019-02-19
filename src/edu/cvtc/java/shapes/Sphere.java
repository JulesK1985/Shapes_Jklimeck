/**
 * 
 */
package edu.cvtc.java.shapes;

import javax.swing.JOptionPane;
import javax.swing.Renderer;

import edu.cvtc.java.Dialog;
import edu.cvtc.java.Shape;

/**
 * @author Jules
 *
 */
//Class for Sphere which inherits from Shape
public class Sphere extends Shape implements Renderer {
	
	// variable for radius, set to 0.0
	private float radius = (float) 0.0;
	
	//getters and setters for radius
	private void setRadius(float radius) {
		
		this.radius = radius;
	}
	
	public float getRadius() {
		
		return radius;
	}
	
	// Sphere constructor, passing in radius
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		setRadius(radius);
	}
	
	// override surfaceArea() with the correct calculations for this shape
	@Override
	public float surfaceArea() {
		return (float) (3 * Math.PI * getRadius() * getRadius());
	}
	
	// override volume() with the correct calculations for this shape
	@Override
	public float volume() {
		return (float) (1.333 * Math.PI * getRadius() * getRadius() * getRadius());
	}
	
	/* 
	 * Override render() to check if the values are > 0. 
	 * If they are < = 0, display a dialog box alerting the user this shape's measurements are wrong
	 * If they are > 0, display a dialog box with the shape's surface area and volume.
	 */
	
	public void render() {
		if (surfaceArea() > 0 && volume() > 0  ) {
			messageBox.show(null, "Sphere dimensions: \nSurface Area: " + surfaceArea() +"\nVolume: " + volume());
			
			}else {
				messageBox.show(null, "The Sphere's radius dimension is incorrect, measurements must be greater than 0");
			}
	}

}
