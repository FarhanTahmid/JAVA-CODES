package FlowLayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutMain {

	public static void main(String[] args) {
		//Layout manager= Defines the natural layout for components within a container.
		
		//FlowLayout= Places components in a row, sized at their preferred size.
		//			  IF the horizontal space in the container is too small, the FlowLayout class uses the next available row
		
		
		
		
		
		
		//creating frame
		JFrame frame=new JFrame();
		
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20)); //flowlayou.center declares the alignment of the butttons
		//															here 20,20 declares the vertical and horizontal space between the buttons
		
		//creating buttons
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		//you can add these buttons to panels also
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
		
		panel.add(new JButton("100"));
		panel.add(new JButton("200"));
		panel.add(new JButton("300"));
		panel.add(new JButton("400"));
		panel.add(new JButton("500"));
		panel.add(new JButton("600"));
		
		frame.add(panel);
		frame.setVisible(true);  //declaring visibilty true at last because sometimes button might not show up.
		

	}

}
