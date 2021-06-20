package com.learning.jtabbedpanedemo;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JFrame {
	
	JTabbedPane jTabbedPane;
	
	public JTabbedPaneDemo()
	{
		jTabbedPane=new JTabbedPane(JTabbedPane.TOP);
		jTabbedPane.addTab("File",null);
		jTabbedPane.addTab("Edit",null);
		jTabbedPane.addTab("View",null);
		jTabbedPane.setSize(350,250);
		
		add(jTabbedPane);
		setTitle("JTabbedPane Demo");
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTabbedPaneDemo demo=new JTabbedPaneDemo();
	}

}
