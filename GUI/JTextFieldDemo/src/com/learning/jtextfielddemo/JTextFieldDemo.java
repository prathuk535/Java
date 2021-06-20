package com.learning.jtextfielddemo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame{
	
	JTextField txtName;
	JPanel jP;
	
	public JTextFieldDemo()
	{
		txtName=new JTextField();
		txtName.setText("Prathmesh");
		jP=new JPanel();
		
		jP.add(txtName);
		add(jP);
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextFieldDemo demo=new JTextFieldDemo();
	}

}
