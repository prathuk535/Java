package com.learning.jbuttondemo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonDemo extends JFrame {
	
	JPanel jp;
	JButton btnSubmit;
	
	public JButtonDemo()
	{
		jp=new JPanel();
		
		btnSubmit=new JButton();
		btnSubmit.setText("Enter");
		
		jp.add(btnSubmit);
		
		add(jp);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButtonDemo demo=new JButtonDemo();
	}

}
