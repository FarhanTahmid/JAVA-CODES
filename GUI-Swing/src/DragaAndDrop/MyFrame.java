package DragaAndDrop;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	DragPanel dragPanel=new DragPanel();
	
	public MyFrame() {


		this.add(dragPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setTitle("Drag and Drop demo");
		this.setVisible(true);
	}

}
