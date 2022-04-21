package OpeningNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchNewPage implements ActionListener {
	
	JFrame frame=new JFrame();
	JButton button=new JButton("Open new window");
	LaunchNewPage(){
		button.setBounds(150,120,150,60);
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			//frame.dispose(); //using this to open window only once
			NewWindowOpen newWindow=new NewWindowOpen();
		}
	}
	

}
