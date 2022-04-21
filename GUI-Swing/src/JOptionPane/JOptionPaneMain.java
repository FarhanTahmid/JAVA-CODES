package JOptionPane;
import javax.swing.*;
public class JOptionPaneMain {

	public static void main(String[] args) {
		
		//JOptionPane= pop up a standard dialogue box that prompts users for a value or inform them something
		
		JOptionPane.showMessageDialog(null,"This is something","title",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is something","title",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is something","title",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is something","title",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is something","title",JOptionPane.ERROR_MESSAGE);
		
		
		JOptionPane.showConfirmDialog(null,"Are you sure?","title",JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(JOptionPane.showConfirmDialog(null,"Are you sure?","title",JOptionPane.YES_NO_CANCEL_OPTION));
		
		String name=JOptionPane.showInputDialog("YOUR NAME?: " );
		System.out.println(name);
		
		//creating all custom pop up button
		String[]responses= {"No you are good","thank you","blush"};
		ImageIcon icon =new ImageIcon("flower.jpg");
		JOptionPane.showOptionDialog(null, "Damn good!","Secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,responses, 0);
	}

}
