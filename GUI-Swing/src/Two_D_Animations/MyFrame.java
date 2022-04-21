package Two_D_Animations;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyPanel panel=new MyPanel();
	
	MyFrame(){
		panel= new MyPanel();
		
		this.add(panel);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.pack();
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
