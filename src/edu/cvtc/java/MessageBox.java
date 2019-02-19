package edu.cvtc.java;
import javax.swing.JOptionPane;

public class MessageBox implements Dialog 
{

	
	public int show(String message, String title) 
	{
		JOptionPane renderMessage = new JOptionPane();
		
		JOptionPane.showMessageDialog(renderMessage, message, title, JOptionPane.OK_OPTION);
		
		return JOptionPane.OK_OPTION;
		
	}
	
	public MessageBox()
	{
		
	}

}
