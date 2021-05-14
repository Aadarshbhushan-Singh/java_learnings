import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1614, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new NewStudent().setVisible(true);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewStudent.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\member-add-on-300x300.png"));
		btnNewStudent.setForeground(Color.RED);
		btnNewStudent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewStudent.setBounds(74, 60, 217, 59);
		contentPane.add(btnNewStudent);
		
		JButton btnNewBook = new JButton("New Book");
		btnNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new newBooks().setVisible(true);
			}
		});
		btnNewBook.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\New book.png"));
		btnNewBook.setForeground(Color.RED);
		btnNewBook.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewBook.setBounds(320, 60, 185, 59);
		contentPane.add(btnNewBook);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new statistics().setVisible(true);
			}
		});
		btnStatistics.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\Statics.png"));
		btnStatistics.setForeground(Color.RED);
		btnStatistics.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnStatistics.setBounds(534, 60, 185, 59);
		contentPane.add(btnStatistics);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new issueBook().setVisible(true);
			}
		});
		btnIssueBook.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\issue.png"));
		btnIssueBook.setForeground(Color.RED);
		btnIssueBook.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIssueBook.setBounds(757, 59, 211, 59);
		contentPane.add(btnIssueBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ReturnBook().setVisible(true);
			}
		});
		btnReturnBook.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\return-book-1-560407.png"));
		btnReturnBook.setForeground(new Color(255, 0, 0));
		btnReturnBook.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReturnBook.setBounds(1008, 60, 203, 59);
		contentPane.add(btnReturnBook);
		
		JButton btnReadnow = new JButton("Read Now");
		btnReadnow.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\issue.png"));
		btnReadnow.setForeground(Color.RED);
		btnReadnow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReadnow.setBounds(1267, 60, 211, 59);
		contentPane.add(btnReadnow);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(MAXIMIZED_BOTH);
				setVisible(false);
				new LoginPage().setVisible(true);
			}
		});
		btnLogOut.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\exit.png"));
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogOut.setBounds(1267, 694, 211, 59);
		contentPane.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\background_image.jpg"));
		lblNewLabel.setBounds(-653, -114, 2253, 980);
		contentPane.add(lblNewLabel);
	}
}
