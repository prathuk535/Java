package com.learning.jcheckboxdemo;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBoxDemo extends JFrame {
	
	JCheckBox bx1,bx2,bx3;
	JPanel jp;
	
	public JCheckBoxDemo()
	{
		jp=new JPanel();
		
		bx1=new JCheckBox("Music");
		bx2=new JCheckBox("Movies");
		bx3=new JCheckBox("Games");
		
		jp.add(bx1);
		jp.add(bx2);
		jp.add(bx3);
		
		add(jp);
		setSize(400,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JCheckBoxDemo demo=new JCheckBoxDemo();
	}

}
