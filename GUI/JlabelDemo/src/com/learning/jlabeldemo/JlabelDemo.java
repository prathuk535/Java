package com.learning.jlabeldemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JlabelDemo extends JFrame {
	
	JPanel container;
	JLabel jFirstName,jLastName;

	public JlabelDemo()
	{
		container=new JPanel();
		jFirstName=new JLabel();
		jLastName=new JLabel();
		jFirstName.setText("First Name");
		jLastName.setText("Last Name");
		
		setSize(200, 200);
		//setLayout(null);
		setVisible(true);
		
		container.add(jFirstName);
		container.add(jLastName);
		add(container);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JlabelDemo demo=new JlabelDemo();
	}

}
