package JLayeredPane;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JLayeredPane;

public class JLayeredPaneMain {

	public static void main(String[] args) {
		
		//JLayeredPane= Swing container that provides a third dimension for positioning components. Example: depth, Z-index
		JLabel label1=new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.orange);
		label1.setBounds(70,70,120,120);
		
		JLabel label2=new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.red);
		label2.setBounds(50,50,120,120);
		
		JLabel label3=new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(90,90,120,120);
		
		
		JLayeredPane layeredPane=new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2,Integer.valueOf(1));     //Integer.valueof(value) decides which label is gonna be on top of another
		//                                                the higher the number the higher the occurance
		layeredPane.add(label3,Integer.valueOf(2));
		
		
		
		//frame
		JFrame frame=new JFrame();
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); //make sure to set in null
		frame.add(layeredPane);
		frame.setVisible(true);
	}

}
