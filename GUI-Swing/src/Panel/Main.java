package Panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {
		//creating labels to add in the layouts
		JLabel label=new JLabel();
		label.setText("HI MOFO");
		ImageIcon icon=new ImageIcon("flower.jpg");
		label.setIcon(icon);
		label.setForeground(Color.black);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setBounds(0,0,250,250);   //setting the position where the label is going to be in the layout and if we set bounds we don't need to setVerticalAlighnment
		
		
		//JPanel= A GUI component that functions as a container to hold other components
		
		JPanel redpanel=new JPanel();       //creating a panel
		redpanel.setBackground(Color.red);  //color of the panel
		redpanel.setBounds(0,0,250,250);    //setting the size and the positions of a panel
		redpanel.setLayout(null);
		
		JPanel bluepanel=new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0,250,250);    
		bluepanel.setLayout(null);
		
		JPanel greenpanel=new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
		greenpanel.setLayout(new BorderLayout());
		greenpanel.setLayout(null);
		
		//creating a frame
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		
		//redpanel.add(label);  //adding the created label to a layout
		//bluepanel.add(label);
		greenpanel.add(label);
	}

}
