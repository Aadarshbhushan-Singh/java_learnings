package learning_gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class class_02_labels {
	public static void main(String[] args) {
		//For frame
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ImageIcon
		ImageIcon img=new ImageIcon("logo.jpg");
		frame.setIconImage(img.getImage());
		
		
		//For label
		JLabel label=new JLabel();
		label.setText("Bro, do you even code??");
//		frame.pack(); //Adjusts itself 
		frame.add(label);
		
		//Add label image
		ImageIcon coderImage=new ImageIcon("coder.png");
		label.setIcon(coderImage);
		
		//Set label Position
		label.setHorizontalTextPosition(JLabel.CENTER); //Image will be at CENTER, LEFT or RIGHT of the image.
		label.setVerticalTextPosition(JLabel.TOP);  //Image will at TOP, CENTER or BOTTOM of the image.
		
		//Set label color, font
		//label.setForeground(Color.red); //Set Default color
		label.setForeground(new Color(14, 200, 196)); //Set custom color of text
		label.setFont(new Font("Arial", Font.PLAIN, 15)); //Font name, Font type, Font size
		
		//set label far from image
		label.setIconTextGap(30); //Sets label 100p far from image.  //Negative number can be used to keep text closer.
		
		//set backgound
		label.setBackground(new Color(143, 63, 57));
		label.setOpaque(true);
		
		//set border
		Border border=BorderFactory.createLineBorder(Color.green, 5);
		label.setBorder(border);
		
		//set allingment of label
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of of text+image to LEFT, CENTER or RIGHT
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of text+image to LEFT, CENTER or RIGHT
		
		//set layout of frame and bounds of label
//		frame.setLayout(null);
//		label.setBounds(100,100,350,350); //(x-coordinate, y-coordinate, width, height)
		
		
		
	}
}
