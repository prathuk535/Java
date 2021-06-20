package com.learning.actionlistnerdemo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListnerDemo3 extends JFrame {
	
	JLabel jMsg;
	JButton jClick, jClick2;
	JPanel jPanel;
	
	public ActionListnerDemo3()
	{
		//event source is jClick button
		jClick=new JButton();
		//setting dimensions of button
		jClick.setBounds(50,120,100,30);
		jClick.setText("Click Here");
		//Associating Event Handler with jClick using eventListener
		//by using new keyword we are invoking an anonymous interface
		jClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jMsg.setText("Button 1 Clicked");
			}
		});
		
		//Event source is jClick button
		jClick2=new JButton();
		//setting dimension of button
		jClick2.setBounds(50,200,100,30);
		jClick2.setText("Click here");
		//Associating Event Handler with JClick using eventListner
		jClick2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jMsg.setText("Button 2 Clicked");
			}
		});
		
		//component to display message after the event is handled
		jMsg=new JLabel();
		jMsg.setBounds(120,180,100,30);
		
		add(jClick);
		add(jClick2);
		add(jMsg);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListnerDemo3 demo=new ActionListnerDemo3();
	}

}
