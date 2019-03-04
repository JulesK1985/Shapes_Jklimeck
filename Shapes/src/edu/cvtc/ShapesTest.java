package edu.cvtc;

public class ShapesTest {

	public static void main(String[] args) {
		
		//new message box
		Dialog messageBox = new MessageBox();
		ShapeFactory shapeFactory = new ShapeFactory(messageBox);
		
		// Cuboid objects
		Cuboid cube = shapeFactory.makeCuboid(2.0f, 3.0f, 3.0f);

		cube.render();

		
		// Cylinder objects
		Cylinder cylinder = shapeFactory.makeCylinder(3.0f, 2.0f);

		cylinder.render();

		
		// Sphere objects
		Sphere sphere = shapeFactory.makeSphere(5.0f);

		sphere.render();

	}

}
