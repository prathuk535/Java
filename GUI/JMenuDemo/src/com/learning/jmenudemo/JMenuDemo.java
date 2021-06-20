package com.learning.jmenudemo;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuDemo extends JFrame{
	
	JMenuBar jMenuBar;
	JMenu fileMenu,editMenu,viewMenu;
	JMenuItem newItem,openItem;
	
	public JMenuDemo()
	{
		jMenuBar=new JMenuBar();
		
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		viewMenu=new JMenu("View");
		
		newItem=new JMenuItem("New");
		openItem=new JMenuItem("Open");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		
		jMenuBar.add(fileMenu);
		jMenuBar.add(editMenu);
		jMenuBar.add(viewMenu);
		
		setJMenuBar(jMenuBar);
		setTitle("Menu Bar Demo");
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JMenuDemo demo=new JMenuDemo();
	}

}
