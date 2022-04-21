package GridLayout;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutMain {

	public static void main(String[] args) {
		//Layout Manager= Defines the natural layout for component within a container
		
		//GridLayout= Places components in a grid of cell
		//			  Each component takes all the available space within its cell, and each cell is the same size
		
		
		//frame
		JFrame frame=new JFrame();
		frame.setSize(420,420);
		//declaring layout for grid operation
		frame.setLayout(new GridLayout(10,0,10,10));   //Layout manager for grid layout. number inside declares row,columns,horizontal spacing between components, vertical spacing between components
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		//adding button
		JButton button1=new JButton("1");
		frame.add(button1);
		//shortcut button creating
 		frame.add(new Button("2"));
 		frame.add(new Button("3"));
 		frame.add(new Button("4"));
 		frame.add(new Button("5"));
 		frame.add(new Button("6"));
 		frame.add(new Button("7"));
 		frame.add(new Button("8"));
 		frame.add(new Button("9"));
 		frame.add(new Button("10"));
 		
 		
		frame.setVisible(true);
	}

}
