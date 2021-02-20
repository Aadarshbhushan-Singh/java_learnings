package learning_gui;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class class_01_first_lecture {
	public static void main(String[] args) {
		//JFrame = a GUI window to add components
		
		JFrame frame= new JFrame(); //creates a new frame
		frame.setSize(420, 420); //Sets the (x,y) dimension of the window 
		frame.setTitle("JFrame Title"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //This can prevent the killing of application.
		frame.setResizable(false); //This can prevent from the resizing of the window
		
		ImageIcon logoImage=new ImageIcon("logo.jpg"); //Create an image icon
		frame.setIconImage(logoImage.getImage());  //Change icon of frame
		//frame.getContentPane().setBackground(Color.green); //change colour of background --> Default colour
		frame.getContentPane().setBackground(new Color(0,0,0)); //Add custom colour --> You can also use hexadecimal 
		
		
		frame.setVisible(true); //makes frame visible
	}
}
