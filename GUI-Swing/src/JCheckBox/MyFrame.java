package JCheckBox;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checkBox;
	ImageIcon xicon;
	ImageIcon checkicon;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//setting image to checkbox
		xicon=new ImageIcon("NSU-LOGO-2021.png");
		checkicon=new ImageIcon("flower.jpg");
		
		
		
		button=new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		button.setFocusable(false);
		
		//declaring checkbox
		checkBox=new JCheckBox(); //creating the checkbox
		checkBox.setText("I am not a robot");//creating a text for the checkbox
		checkBox.setFocusable(false);// removing the border around the text;
		checkBox.setFont(new Font("Gothic",Font.ITALIC,15));//setting the text style
		
		//setting icons to checkboxes instead of just a tick
		/*
		checkBox.setIcon(xicon);
		checkBox.setSelectedIcon(checkicon);
		*/
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			if(checkBox.isSelected()) {
				System.out.println("user is human");
			}
			else{
				System.out.println("user is robot");
			}
			
		}
		
	}

}
