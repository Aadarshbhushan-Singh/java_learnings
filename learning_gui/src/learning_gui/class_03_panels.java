package learning_gui;
import java.awt.Color;
import javax.swing.*;

public class class_03_panels {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,750);
		frame.setLayout(null);
		frame.setVisible(true);
	
		//JPanel is a GUI component that holds other components and acts as a container.
		JPanel redPanel=new JPanel();
		redPanel.setBackground(Color.blue);
		redPanel.setBounds(10, 10, 250, 250);
		
		
	}
}
