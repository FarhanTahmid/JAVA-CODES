/*Basically we created this class to increase code re usabilty and calling the frame class with a constructor from the main function
rather than creating it in the main function*/

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class AnotherWayToCreateFrame extends JFrame {
	AnotherWayToCreateFrame(){
		
		this.setSize(420,420); //declaring size of the this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setTitle("thiss Basic"); //sets title of the this
		this.setVisible(true); //making this visible
		
		ImageIcon image=new ImageIcon("NSU-LOGO-2021.png"); //will create an image icon
		this.setIconImage(image.getImage()); //this will change the icon of the this
		
		//changing background
		this.getContentPane().setBackground(Color.black);
		
		//setting custom color with RGB number
		//this.getContentPane().setBackground(new Color(123,50,250));
		
		//setting custom color with hexadecimal code
		//this.getContentPane().setBackground(new Color(0x123456));
	}
}
