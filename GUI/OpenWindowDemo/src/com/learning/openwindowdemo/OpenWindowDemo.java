package com.learning.openwindowdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OpenWindowDemo extends JFrame{
	
	JButton jClick;
	
	public OpenWindowDemo()
	{
		jClick=new JButton();
		//setting dimensions of button
		jClick.setBounds(50,120,100,30);
		jClick.setText("Click Here");
		//Associating EventHandler with JClick using eventListener
		//by using new keyword we are invoking an anonymous interface
		jClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NewWindow window=new NewWindow();
				setVisible(false);
				window.setVisible(true);
			}
		});
		setSize(400,300);
		setLayout(null);
		setVisible(true);
		
		add(jClick);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenWindowDemo demo=new OpenWindowDemo();
	}

}
