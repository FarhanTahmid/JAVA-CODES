package JFileChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	
	MyFrame(){
		
		button = new JButton("Select");
		button.addActionListener(this);
		button.setFocusable(false);
		
		
		
		
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.pack();
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser filechooser=new JFileChooser();
			filechooser.setCurrentDirectory(new File("G:\\CODES")); //selects the deafult location
			int response=filechooser.showOpenDialog(null); //this will select file to open. returns an integer value between 0 and 1
			//int response=filechooser.showSaveDialog(null);   // this will save the selected file
			if(response==0) { //(response==filechooser.APPROVE_OPTION) 
				File file= new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}
}
