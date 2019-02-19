/**
 * 
 */
package edu.cvtc.java;

/**
 * @author Jules
 *
 */
// 
// Superclass Shape
public abstract class Shape 
{
	public Dialog messageBox;
	
	protected Dialog getMessageBox()
	{
		return this.messageBox;
	}
	
	private void setMessageBox(Dialog messageBox)
	{
		this.messageBox = messageBox;
	}
	
	public Shape(Dialog messageBox)
	{
		this.messageBox = messageBox;
	}
	
	public abstract float surfaceArea();
	
	public abstract float volume();
	
	//not needed here anymore
	//public abstract void render();
		
	
}
