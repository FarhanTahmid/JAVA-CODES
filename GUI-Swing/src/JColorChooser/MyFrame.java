package JColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorChooserUI;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
	
	public MyFrame() {
		
		
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label= new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setText("This is a text");
		label.setFont(new Font("Gothic",Font.BOLD,25));
		
		
		
		
		this.add(button);
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JColorChooser colorChooser= new JColorChooser();
			
			Color color=JColorChooser.showDialog(null, "Pick a color", Color.black);  //opens a color box to choose a color
			label.setForeground(color); //sets the text color to a choosen color
			//label.setBackground(color); //also can change the background color
			
		}
		
	}
}
