package RadioButtons;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
	JRadioButton pizzabutton;
	JRadioButton hamburgerbutton;
	JRadioButton hotdogbutton;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//creating Radio button
		pizzabutton=new JRadioButton("Pizza");
		pizzabutton.setFocusable(false);
		pizzabutton.addActionListener(this);
		
		hamburgerbutton=new JRadioButton("Hamburger");
		hamburgerbutton.setFocusable(false);
		hamburgerbutton.addActionListener(this);
		
		hotdogbutton=new JRadioButton("Hot dog");
		hotdogbutton.setFocusable(false);
		hotdogbutton.addActionListener(this);
		
		//creating a buttonGroup(selects only 1 item)
		//to select only 1 item
		ButtonGroup group = new ButtonGroup();
		group.add(pizzabutton);
		group.add(hamburgerbutton);
		group.add(hotdogbutton);
		
		//You can change the icons of the radio button just by adding icons like JCHEKCBOX
		
		
		this.add(pizzabutton);
		this.add(hamburgerbutton);
		this.add(hotdogbutton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzabutton) {
			System.out.println("You ordered Pizza!");
		}
		else if(e.getSource()==hamburgerbutton) {
			System.out.println("You ordered Hamburger!");
		}
		else if(e.getSource()==hotdogbutton) {
			System.out.println("You ordered Hot dog!");
		}
		
	}
	
	
}
