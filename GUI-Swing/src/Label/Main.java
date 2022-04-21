package Label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		ImageIcon image=new ImageIcon("flower.jpg");
		Border border =BorderFactory.createLineBorder(Color.red,3); //creating instance for border
		
	
		//JLabel= it is a GUI display area for a string of text, an image or both
		//setting label
		JLabel label=new JLabel();
		label.setText("Code mofo code");   //set text of level
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);//set text left,center,right of image icon
		label.setVerticalTextPosition(JLabel.TOP); // set text,top,center or bottom
		label.setForeground(Color.white);  //set color of text
		label.setFont(new Font("Gothic",Font.BOLD, 20)); //set font style
		label.setIconTextGap(30); //sets  gap between text and image. Give negative number to close the gap
		label.setBackground(Color.pink);//set background color of the label
		label.setOpaque(true); //displays the background color of the label
		label.setBorder(border); //creating a line border for the label
		label.setVerticalAlignment(JLabel.CENTER); //sets vertical position of icon+text with in label
		label.setHorizontalAlignment(JLabel.CENTER); ////sets vertical position of icon+text with in label
		label.setBounds(0,100,430,420);// setting label bounds
		
		
		//Frame code
		JFrame frame=new JFrame();
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
		frame.setTitle("Label");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setLayout(null); //to set layout for label
		//frame.pack(); //this method can accomodate the size of layout as per need. No inputs required
		

	}

}
