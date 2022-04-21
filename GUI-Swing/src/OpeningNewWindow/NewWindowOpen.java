package OpeningNewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindowOpen {
	JFrame newFrame=new JFrame();
	JLabel label =new JLabel("Hello");
	public NewWindowOpen() {
		// TODO Auto-generated constructor stub
		
		label.setBounds(0,0,100,100);
		label.setFont(new Font(null,Font.BOLD,30));
		
		newFrame.add(label);
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setSize(420,420);
		newFrame.setLayout(null);
		newFrame.setVisible(true);
	}
}
