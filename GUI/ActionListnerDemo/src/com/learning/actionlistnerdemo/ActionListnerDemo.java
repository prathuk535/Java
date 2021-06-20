package com.learning.actionlistnerdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListnerDemo extends JFrame implements ActionListener{
	
	JLabel jMsg;
	JButton jClick;
	//JPanel jPanel;
	
	public ActionListnerDemo()
	{
		//Event source is jClick button
		jClick=new JButton();
		//setting dimensions of button
		jClick.setBounds(120,120,100,30);
		jClick.setText("Click Here");
		//Associating Event Handler with jClick using eventListner
		jClick.addActionListener(this);
		
		//component to display message after the event is handled
		jMsg=new JLabel();
		jMsg.setBounds(120,180,10,30);
		
		add(jClick);
		add(jMsg);
		
		setSize(400,40);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//msg to be displayed after successful event handling
		jMsg.setText("Button Clicked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListnerDemo demo=new ActionListnerDemo();
	}

}
