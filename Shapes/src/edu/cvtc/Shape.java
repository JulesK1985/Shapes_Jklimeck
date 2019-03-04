package edu.cvtc;

//Superclass Shape
public abstract class Shape {
	public Dialog messageBox;
	
	// Getter & setter for messageBox
	protected Dialog getMessageBox() {
		return this.messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public Shape(Dialog messageBox) {
		super();
		this.messageBox = messageBox;
	}
	
	// Methods for surface are and volume
	public abstract float surfaceArea();
	
	public abstract float volume();
	
}
