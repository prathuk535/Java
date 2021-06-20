package com.learning.eventhandlingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandlingDemo extends JFrame implements ActionListener {
	
	//JPanel jPanel;
	JButton btnClick;
	JLabel lblMsg;
	
	public EventHandlingDemo()
	{
		//jPanel=new JPanel();
		btnClick=new JButton();
		btnClick.setBounds(120,50,100,20);
		btnClick.setText("Click Here");
		
		lblMsg=new JLabel();
		lblMsg.setBounds(120,150,100,20);
		
		//jPanell.add(btnClick);
		//jPanel.add(lblMsg);
		
		btnClick.addActionListener(this);
		
		//add(jPanel);
		
		add(btnClick);
		add(lblMsg);
		
		setSize(400,300);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		lblMsg.setText("Button Clicked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventHandlingDemo demo=new EventHandlingDemo();
	}

}
