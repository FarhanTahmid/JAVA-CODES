package Two_D_Animations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
	
	final int PANEL_WIDTH=500;
	final int PANEL_HEIGHT=500;
	Image enemy;
	Image background;
	Timer timer;
	int xVelocity=1;
	int yVelocity=1;
	int x=0;
	int y=0;
	
	MyPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_HEIGHT,PANEL_WIDTH));
		this.setBackground(Color.black);
		enemy=new ImageIcon("NSU-LOGO-2021-resized.png").getImage();
		background=new ImageIcon("NSU-LOGO-2021.png").getImage();
		
		timer=new Timer(1000,null);  //passing a timer to do a task (time in millisecond,null)
		timer.start();
		
		
		
	}
	public void grpahics(Graphics g) {
		super.paint(g); //paint background
		
		Graphics2D g2d=(Graphics2D)g;
		g2d.drawImage(enemy, x, y, null);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//creating animation for x axis
		
		/*
		if(x>=PANEL_WIDTH-enemy.getWidth(null)||x<0) {
			xVelocity=xVelocity*(1);
		}
		*/
		
		//creating animation for y axis
		if(y>=PANEL_WIDTH-enemy.getWidth(null)||x<0) {
			yVelocity=yVelocity*(1);
		}
		y=y+yVelocity;
		repaint();
	}
}
