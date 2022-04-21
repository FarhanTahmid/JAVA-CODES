package MenuBar;

import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



public class MyFrame extends JFrame implements ActionListener{
	
	JMenuItem loaditem;
	JMenuItem saveitem;
	JMenuItem exititem;
	ImageIcon saveIcon;
	
	public MyFrame() {
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(540,540);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		
		//creating menubar
		JMenuBar bar=new JMenuBar();
		//creating menubar items
		JMenu fileMenu=new JMenu("File");
		JMenu editMenu=new JMenu("Edit");
		JMenu helpMenu=new JMenu("Help");
		
		//items in the file menu
		loaditem=new JMenuItem("Load");
		saveitem=new JMenuItem("Save");
		exititem=new JMenuItem("Exit");
		
		//adding action listener to the items
		loaditem.addActionListener(this);
		saveitem.addActionListener(this);
		exititem.addActionListener(this);
		
		//creating image icons for the menu items
		saveIcon= new ImageIcon("flower.jpg");
		saveitem.setIcon(saveIcon);
		
		//keyboard shortcuts for menu items. we can press a button and access the tasks of the menu items
		
		fileMenu.setMnemonic(KeyEvent.VK_F);  //Alt+F to file
		helpMenu.setMnemonic(KeyEvent.VK_H);  //Alt+H to help      //remember its always alt+key for the JMenu objects
		editMenu.setMnemonic(KeyEvent.VK_D);  //Alt+D to edit
		
		loaditem.setMnemonic(KeyEvent.VK_L);  //L to load
		saveitem.setMnemonic(KeyEvent.VK_S);  //S to save
		exititem.setMnemonic(KeyEvent.VK_E);  //E to exit
		
		
		
		
		//adding menu items to the file menu
		fileMenu.add(loaditem);
		fileMenu.add(saveitem);
		fileMenu.add(exititem);
		
		
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(helpMenu);
		
		this.setJMenuBar(bar);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loaditem) {
			System.out.println("Loading a file");
		}
		else if(e.getSource()==saveitem) {
			System.out.println("Saving the item");
		}
		else if(e.getSource()==exititem) {
			System.out.println("Exiting the program");
		}
		
	}

}
