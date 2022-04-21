package TextFields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JTextField textField;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this); //making button interactive
		
		textField=new JTextField();  //initializes a textfield
		textField.setPreferredSize(new Dimension(250,40)); //giving size
		//customizing
		textField.setFont(new Font("Gothic",Font.PLAIN,35));
		textField.setForeground(Color.cyan); //setting color of whats inside the box
		textField.setBackground(Color.black);// setting the box color
		textField.setCaretColor(Color.blue);
		textField.setText("Username");//sets a removable text inside the box
		//textField.setEditable(false); //locks the textfield
		
		this.add(button);
		this.add(textField);
		this.pack(); //this packs all the components without declaring the size of the frame
		this.setVisible(true);

	}
	@Override 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Welcome "+textField.getText()); //this will print if button is pressed
		}
	}
	
}
