package edu.cvtc.java.shapes.UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.cvtc.java.MessageBox;
import edu.cvtc.unitTests.Cuboid;
import edu.cvtc.unitTests.Cylinder;
import edu.cvtc.unitTests.Sphere;

class ShapesUnitTests 
{

	public static void main(String[] args)
	{
		MessageBox messageBox = new MessageBox();
		
		edu.cvtc.java.shapes.Cuboid cube1 = new Cuboid(1.0f, 1.0f, 1.0f);
		//edu.cvtc.java.shapes.Cuboid cube2 = new Cuboid(2.0f, 2.0f, 2.0f);
		//edu.cvtc.java.shapes.Cuboid cube3 = new Cuboid(3.0f, 3.0f, 3.0f);
		cube1.render();
		//cube2.render();
		//cube3.render();
		//
		edu.cvtc.java.shapes.Cylinder cylinder1 = new Cylinder(1.0f, 4.0f);
		//edu.cvtc.java.shapes.Cylinder cylinder2 = new Cylinder(2.0f, 5.0f);
		//edu.cvtc.java.shapes.Cylinder cylinder3 = new Cylinder(3.0f, 6.0f);
		cylinder1.render();
		//cylinder2.render();
		//cylinder3.render();
		//
		edu.cvtc.java.shapes.Sphere sphere1 = new Sphere(2.0f);
		//edu.cvtc.java.shapes.Sphere sphere2 = new Sphere(4.0f);
		//edu.cvtc.java.shapes.Sphere sphere3 = new Sphere(10.0f);
		sphere1.render();
		//sphere2.render();
		//sphere3.render();
		
	}
	

}
