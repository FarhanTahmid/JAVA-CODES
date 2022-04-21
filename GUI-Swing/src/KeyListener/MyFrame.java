package KeyListener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {
	
	JLabel label;
	ImageIcon icon;
	
	public MyFrame() {
		
		icon=new ImageIcon("flower.jpg");
		
		label=new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setIcon(icon);
		
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	@Override
	//keyTyped= invoked when a key is typed, Uses keyChar, char output
	
	
	public void keyTyped(KeyEvent e) {

		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-1,label.getY());break;
		case 'w': label.setLocation(label.getX(),label.getY()+1);break;          //moves the label selected in a certain direction by pressing the keys
		case 's': label.setLocation(label.getX(),label.getY()-1);break;   
		case 'd': label.setLocation(label.getX()+1,label.getY());break;
		}
		
	}

	@Override
	//keyPressed= Invoked when a physical key is pressed down. Uses keyCode, int output
	
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-1,label.getY());break;
		case 38: label.setLocation(label.getX(),label.getY()+1);break;          //moves the label selected in a certain direction by pressing the keyCodes
		case 40: label.setLocation(label.getX(),label.getY()-1);break;   
		case 39: label.setLocation(label.getX()+1,label.getY());break;
		}
	
	}

	@Override
	//keyReleased=called whenever a button is released
	public void keyReleased(KeyEvent e) {
		System.out.println("You released the key char: "+e.getKeyChar());
		System.out.println("You released the key code: "+e.getKeyCode());
	}

	
}
