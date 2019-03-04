package edu.cvtc;

public class ShapeFactory {

	private Dialog dialog;
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	private Dialog getDialog() {
		return dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	//Use shapeFactory method to build shapes
	public Cuboid makeCuboid(float width, float height, float depth) {
		return new Cuboid(getDialog(), width, height, depth);
	}
	
	public Cylinder makeCylinder(float radius, float height) {
		return new Cylinder(getDialog(), radius, height);
	}
	
	public Sphere makeSphere(float radius) {
		return new Sphere(getDialog(), radius);
	}

}
