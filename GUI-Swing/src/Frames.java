

public class Frames {

	public static void main(String[] args) {
		//here is the way to create a frame function in the main
		/*
		JFrame frame=new JFrame(); //creating a frame
		frame.setSize(420,420); //declaring size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setTitle("Frames Basic"); //sets title of the frame
		frame.setVisible(true); //making frame visible
		
		ImageIcon image=new ImageIcon("NSU-LOGO-2021.png"); //will create an image icon
		frame.setIconImage(image.getImage()); //this will change the icon of the frame
		
		//changing background
		frame.getContentPane().setBackground(Color.black);
		
		//setting custom color with RGB number
		//frame.getContentPane().setBackground(new Color(123,50,250));
		
		//setting custom color with hexadecimal code
		//frame.getContentPane().setBackground(new Color(0x123456));
		 * 
		 */
		
		//Way to call a class and to create a frame
		//creating instance of anotherwaytocreateframe
		//AnotherWayToCreateFrame frame=new AnotherWayToCreateFrame();
		
		//another way to call the frame is
		new AnotherWayToCreateFrame();
	}

}
