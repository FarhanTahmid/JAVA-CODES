package JSlider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	public SliderDemo() {
		frame =new JFrame("Slider Demo");
		panel=new JPanel();
		label=new JLabel();
		slider=new JSlider(0,100,50); //(minimum value, maximum Value, starting value)
		slider.setPreferredSize(new Dimension(400,200)); //setting size of the slider
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10); //sets small ticks after a certain amount of value
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);//sets major ticks after a certain Value
		
		slider.setPaintLabels(true); //make visibles the numbers in the sliders of major spacing
		slider.setFont(new Font("Gothic",Font.ITALIC,13));
		
		slider.setOrientation(SwingConstants.VERTICAL); //makes the slider orientation vertical
		
		label.setText(" °Celcius= "+slider.getValue()); // to print the value of the slider
		label.setFont(new Font("Gothic",Font.ITALIC,25));
		slider.addChangeListener(this);
		
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(" °Celcius= "+slider.getValue()); //to print the value of the slider
		System.out.println(slider.getValue());
		//int sum=slider.getValue()+50;
		//System.out.println("Sum= "+sum);
		
	}
	

}
