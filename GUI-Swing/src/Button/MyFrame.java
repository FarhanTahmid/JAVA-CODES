package Button;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MyFrame extends JFrame implements ActionListener{   //ActionListener makes a button interactive
	JButton button;   //declaring these golbally cause we have to access them in the overwritten method
	JLabel label;
	MyFrame(){
		//creating image icon for button
		ImageIcon image=new ImageIcon("emoji.jpg");
				
		this.setVisible(true);
		this.setSize(720,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		
		//Creating a button
		JButton button=new JButton();  //creating a button
		button.setBounds(200,200,300,50); //declaring the border for the button
		this.add(button); //adding button to the frame
		button.addActionListener(e -> System.out.println("AHH"));  //makes the button interactive and does what has been told to do after clicking
		button.setText("Press me Senpai!");
		button.setFocusable(false); //initializing to false to avoid annoying corners around the button texts
		//button.setIcon(image);  //commenting out cause the image is too big
		button.setHorizontalTextPosition(JButton.CENTER); //aligning the button with respect to the icon
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Gothic",Font.BOLD,20));  //setting font for button text
		button.setForeground(Color.blue); //setting the color of the text inside the button
		button.setBackground(Color.LIGHT_GRAY); //setting the background color of the button
		button.setBorder((BorderFactory.createLineBorder(getBackground()))); //setting a border for the button as per the background color. There are many options
		//button.setEnabled(false);  //to disable a button
		
		//creating a label for the button to show after button is pressed
		label=new JLabel();
		ImageIcon image2=new ImageIcon("Flower.jpg");
		label.setIcon(image2);
		label.setVisible(false);
		button.addActionListener(e -> label.setVisible(true));  //making the label visible after clicking the button
		label.setBounds(150,150,150,150);
		
		this.add(label); //adding the label to the frame
		
	
	}
	
	//don't know why this isn't working
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Ahh");
			label.setVisible(true);  //it shows the label after clicking the button 
		}
		
	}
	*/
}
