package learning_gui;
import java.awt.Label;
import javax.swing.*;
//import javax.swing.JFrame;

public class class_04_buttons {
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		
		JButton button=new JButton();
		button.setBounds(0, 0, 100, 100);
		
		frame.add(button);
	}
}
