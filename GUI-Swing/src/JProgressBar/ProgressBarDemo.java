package JProgressBar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo extends JFrame {
	JProgressBar bar=new JProgressBar();
	
	ProgressBarDemo(){
		
		bar.setValue(0); //set-default value
		bar.setStringPainted(true);  //sets a percentage value to the bar
		bar.setFont(new Font("Gothic",Font.BOLD,30)); //set font style in the bar
		bar.setForeground(Color.black); //sets barline color
		bar.setBackground(Color.cyan);  //sets bar background color
		
		
		this.add(bar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(420,420);
		this.setLayout(new FlowLayout()); 
		
	
		
		fill();
	}
	public void fill() {
		int counter=0;
		while(counter<=100)
		{
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			counter++;
		}
		bar.setString("DONE!");
	}
	
}
