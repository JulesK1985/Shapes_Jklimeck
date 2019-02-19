/**
 * 
 */
package edu.cvtc.java.shapes;
import javax.swing.JOptionPane;
import javax.swing.Renderer;

import edu.cvtc.java.*;

/**
 * @author Jules
 *
 */
// Class for Cuboid which inherits from Shape
public class Cuboid extends Shape implements Renderer {
	
	// variables for width, height and depth, set to 0.0
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	
	// getters and setters for width, height and depth
	public float getWidth() {
		
		return width;
	}
	
	private void setWidth(float width) {
		
		this.width = width;
	}
	
	public float getHeight() {
		
		return height;
	}
	
	private void setHeight(float height) {
		
		this.height = height;
	}
	
	public float getDepth() {
		
		return depth;
	}
	
	private void setDepth(float depth) {
		
		this.depth = depth;
	}
	
	// Cuboid constructor, passing in width, height and depth
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	
	// override surfaceArea() with the correct calculations for this shape
	@Override
	public float surfaceArea() {
		return 2*(getDepth()*getWidth()) + 2*(getHeight()*getWidth()) + 2*(getDepth()*getHeight());
	}
	
	// override volume() with the correct calculations for this shape
	@Override
	public float volume() {
		return getDepth()*getWidth()*getHeight();
	}
	
	/* 
	 * Override render() to check if the values are > 0. 
	 * If they are < = 0, display a dialog box alerting the user this shape's measurements are wrong
	 * If they are > 0, display a dialog box with the shape's surface area and volume.
	 */
	
	public void render() {
		if (surfaceArea() > 0 && volume() > 0  ) {
		messageBox.show(null, "Cuboid dimensions: \nSurface Area: " + surfaceArea() +"\nVolume: " + volume());
		
		}else {
			messageBox.show(null, "One of the Cuboid's dimensions are incorrect, measurements must be greater than 0");
		}
	}
	
}
