package Two_D_Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;



public class MyFrame extends JFrame {
	
	MyPanel panel=new MyPanel();
	
	public MyFrame() {
		
		
		panel=new MyPanel();
		this.add(panel);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.pack();
		this.setLayout(null);
		this.setVisible(true);
	}
	

}
