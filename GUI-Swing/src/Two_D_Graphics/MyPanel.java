package Two_D_Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	Image image;
	public MyPanel() {
		image=new ImageIcon("nehal-resized.jpg").getImage();
		this.setPreferredSize(new Dimension(500,500));
		
	}
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D)g;  //typeCasting g object to Graphics2D
		g2d.setStroke(new BasicStroke(5)); //thickens the line
		g2d.setPaint(Color.blue); //changing the color
		g2d.drawLine(0, 0, 500, 500);  //draw a line.. (starting point x, starting point y, height,width)
		g2d.drawRect(10, 10, 100, 200);  // draw a rectangle
		g2d.fillRect(150, 120, 100, 100); // creating a filled rectangle //you can fill any items you want
		g2d.setPaint(Color.red);
		g2d.drawOval(50, 50, 100, 100); //creating a circle
		g2d.drawOval(100, 100, 100, 70); //creating a oval
		g2d.setPaint(Color.cyan);
		g2d.drawArc(250, 120, 100, 70, 180, 100); //creating an arc
		
		
		//draw triangle
		int[] xpoints= {150,250,350};
		int[] ypoints= {300,150,300};
		g2d.setPaint(Color.magenta);
		g2d.drawPolygon(xpoints,ypoints,3);
		
		//draw text
		g2d.setPaint(Color.black);
		g2d.setFont(new Font("Gothic",Font.BOLD,25));
		g2d.drawString("You are a champion", 250, 250);
		
		
		//adding image
		g2d.drawImage(image, 300, 320,null);
	}

}
