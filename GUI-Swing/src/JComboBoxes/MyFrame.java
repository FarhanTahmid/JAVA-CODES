package JComboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox combobox;
	JComboBox combobox2;
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//declaring combo box
		String[] animals= {"Dog", "Cat","Bird"};
		Integer[] number= {1,2,3}; //Have to use wrapper class for numbers if you wnat to addd them in the combobox
		
		combobox2=new JComboBox(number);
		
		combobox=new JComboBox(animals);
		combobox.addActionListener(this);
		
		//combobox.setEditable(true); //this lets to type in the combobox alongside selecting;
		
		//System.out.println(combobox.getItemCount()); //gets the count of the items inside the box
		
		combobox.addItem("Horse"); //adds item in the box
		
		combobox.insertItemAt("Cow",2);//adds item in specific index
		//combobox.setSelectedIndex(2);//sets the outcome to index 2 for the first entry be default;
		
		combobox.removeItem("Cat"); //removing an item
		combobox.removeItemAt(1); //removing an item from an index
		
		//combobox.removeAllItems(); //removes all items
		
		this.add(combobox2);
		this.add(combobox);
		this.pack();
		this.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combobox) {
			System.out.println(combobox.getSelectedItem());
			//System.out.println(combobox.getSelectedIndex());
		}
		
	}

}
