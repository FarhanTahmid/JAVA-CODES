package MouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	public MyFrame() {
		
		
		label=new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.addMouseListener(this);
		
	
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	// invoked when a mouse button has been clicked (pressed and released) on a component
	public void mouseClicked(MouseEvent e) {
		//System.out.println("You clicked the mouse");
		label.setBackground(Color.red);
	
		
	}

	@Override
	// invoked when a mouse button has been pressed on a component
	public void mousePressed(MouseEvent e) {
		//System.out.println("You pressed the mouse");
		label.setBackground(Color.green);
	}

	@Override
	// invoked when a mouse button has been released on a component
	public void mouseReleased(MouseEvent e) {
		//System.out.println("You released the mouse");
		label.setBackground(Color.YELLOW);
	}

	@Override
	// invoked when a mouse enters a component
	public void mouseEntered(MouseEvent e) {
		//System.out.println("You entered in the component");
		label.setBackground(Color.blue);
		
	}

	@Override
	// invoked when a mouse exits a component
	public void mouseExited(MouseEvent e) {
		//System.out.println("You exited in the component");
		label.setBackground(Color.cyan);
	}
}
