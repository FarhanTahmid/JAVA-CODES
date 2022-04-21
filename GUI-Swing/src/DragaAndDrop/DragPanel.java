package DragaAndDrop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {
	
	ImageIcon image1=new ImageIcon("rifat-resized.jpg");
	ImageIcon image2=new ImageIcon("marilyn-resized.jpg");
	ImageIcon image3=new ImageIcon("nehal-resized.jpg");
	
	final int width1=image1.getIconWidth();
	final int height1=image1.getIconHeight();
	
	final int width2=image2.getIconWidth();
	final int height2=image2.getIconHeight();
	
	final int width3=image3.getIconWidth();
	final int height3=image3.getIconHeight();
	
	Point imageCorner1;
	Point prevPoint1;
	
	Point imageCorner2;
	Point prevPoint2;
	
	Point imageCorner3;
	Point prevPoint3;
	
	DragPanel() {
		
		imageCorner1=new Point(0,0);
		imageCorner2=new Point(50,50);
		imageCorner3=new Point(100,100);
		
		ClickListener clickListener=new ClickListener();
		DragListener dragListener=new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image1.paintIcon(this, g, (int)imageCorner1.getX(), (int)imageCorner1.getY());
		image2.paintIcon(this, g, (int)imageCorner2.getX(), (int)imageCorner2.getY());
		image3.paintIcon(this, g, (int)imageCorner3.getX(), (int)imageCorner3.getY());
	}
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			prevPoint1=e.getPoint();
			prevPoint2=e.getPoint();
			prevPoint3=e.getPoint();
		}
	}
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPt=e.getPoint();
			Point currentPt2=e.getPoint();
			Point currentPt3=e.getPoint();
			
			imageCorner1.translate((int)(currentPt.getX()-prevPoint1.getX()), (int)(currentPt.getX()-prevPoint1.getY()));
			imageCorner2.translate((int)(currentPt2.getX()-prevPoint2.getX()), (int)(currentPt2.getX()-prevPoint2.getY()));
			imageCorner3.translate((int)(currentPt3.getX()-prevPoint3.getX()), (int)(currentPt3.getX()-prevPoint3.getY()));
			
			prevPoint1=currentPt;
			prevPoint2=currentPt2;
			prevPoint3=currentPt3;
			
			repaint();
		}
	}
}
