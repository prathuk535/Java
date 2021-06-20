package com.learning.jframedemo;

import javax.swing.JFrame;

public class JFrameDemo {
	
	JFrame jFrame;
	
	public JFrameDemo()
	{
		jFrame=new JFrame();
		jFrame.setTitle("Sample Frame");
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameDemo demo=new JFrameDemo();
	}

}
