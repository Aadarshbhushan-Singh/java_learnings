package learning_gui;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

public class class_03_panels {
	public static void main(String[] args) {
		
		ImageIcon icon=new ImageIcon("logo.jpg");
		
		JLabel label=new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 75, 75);
		
		JPanel redPanel=new JPanel(); //Creating new Panel
		redPanel.setBackground(Color.red); //Setting background color.
		redPanel.setBounds(0, 0, 250, 250); //Setting background
		redPanel.setLayout(null);

		
		JPanel bluePanel=new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(null);
		
		
		JPanel greenPanel=new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		frame.add(redPanel); //Adding panel to frame.
		redPanel.add(label);
		frame.add(bluePanel);
		frame.add(greenPanel);
//		greenPanel.add(label); //Add label to the panel.
		
		
		
		
	}
}
