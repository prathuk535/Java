package com.learning.jpaneldemo;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame {
	
	JPanel jPanel;
	
	public JPanelDemo()
	{
		jPanel=new JPanel();
		
		jPanel.setSize(350,250);
		jPanel.setVisible(true);
		
		add(jPanel);
		setSize(400 ,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanelDemo demo=new JPanelDemo();
	}

}
