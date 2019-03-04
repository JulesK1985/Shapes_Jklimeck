package edu.cvtc;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	public MessageBox() {
		
	}

	
	public int show(String message, String title) {
		JOptionPane renderMessage = new JOptionPane();
		JOptionPane.showMessageDialog(renderMessage,  message, title, JOptionPane.OK_OPTION);
		return JOptionPane.OK_OPTION;
	}

}
