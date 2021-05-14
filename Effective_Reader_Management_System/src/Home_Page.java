import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1555, 868);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JPanel panelMessage = new JPanel();
		panelMessage.setBounds(804, 31, 653, 771);
		contentPane.add(panelMessage);
		panelMessage.setLayout(null);
		
		JPanel panelButtons = new JPanel();
		panelButtons.setBorder(new TitledBorder(null, "ERMS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelButtons.setBounds(54, 20, 295, 771);
		contentPane.add(panelButtons);
		panelButtons.setLayout(null);
		
		JButton btnNewBook = new JButton("New Book");
		btnNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new New_Book().setVisible(true);
			}
		});
		btnNewBook.setBounds(31, 95, 223, 65);
		panelButtons.add(btnNewBook);
		btnNewBook.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\New book.png"));
		btnNewBook.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnIssueBooks = new JButton("Issue Books");
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Issue_Books().setVisible(true);
			}
		});
		btnIssueBooks.setBounds(31, 170, 223, 65);
		panelButtons.add(btnIssueBooks);
		btnIssueBooks.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\issue.png"));
		btnIssueBooks.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnReadNow = new JButton("Read Now");
		btnReadNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Read_Now().setVisible(true);
			}
		});
		btnReadNow.setBounds(31, 245, 223, 65);
		panelButtons.add(btnReadNow);
		btnReadNow.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\issue.png"));
		btnReadNow.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnReturnBooks = new JButton("Return Books");
		btnReturnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Return_Book().setVisible(true);
			}
		});
		btnReturnBooks.setBounds(31, 320, 223, 65);
		panelButtons.add(btnReturnBooks);
		btnReturnBooks.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\return book png.png"));
		btnReturnBooks.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnShowData = new JButton("Show Data");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Show_Data().setVisible(true);
			}
		});
		btnShowData.setBounds(31, 395, 223, 65);
		panelButtons.add(btnShowData);
		btnShowData.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\Statics.png"));
		btnShowData.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnAlert = new JButton("Alert");
		btnAlert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Alert().setVisible(true);
			}
		});
		btnAlert.setBounds(31, 470, 223, 65);
		panelButtons.add(btnAlert);
		btnAlert.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\alert.png"));
		btnAlert.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.setBounds(31, 20, 223, 65);
		panelButtons.add(btnNewStudent);
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new New_Student().setVisible(true);
				panelMessage.setVisible(false);
			}
		});
		btnNewStudent.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\member-add-on-300x300.png"));
		btnNewStudent.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnDeleteBook = new JButton("Delete Book\r\n");
		btnDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Delete_Book().setVisible(true);
			}
		});
		btnDeleteBook.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnDeleteBook.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeleteBook.setBounds(31, 545, 223, 65);
		panelButtons.add(btnDeleteBook);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMessage.setVisible(false);
				new Delete_Students().setVisible(true);
			}
		});
		btnDeleteStudent.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnDeleteStudent.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDeleteStudent.setBounds(31, 620, 223, 65);
		panelButtons.add(btnDeleteStudent);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(31, 695, 223, 65);
		panelButtons.add(btnLogOut);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login_Page().setVisible(true);
			}
		});
		btnLogOut.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\exit.png"));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		
		JLabel lblNewLabel = new JLabel("Effective Reader Management System");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(123, 25, 420, 64);
		panelMessage.add(lblNewLabel);
		
		JTextPane txtpnThisSoftwareIs = new JTextPane();
		txtpnThisSoftwareIs.setEditable(false);
		txtpnThisSoftwareIs.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnThisSoftwareIs.setText("This software is made as a DBMS Project. This is a effective reader management system where a librarian can manage all the books in the library along with the students who are willing to read it in library or take it home. \r\n\r\nIn the lift sides you can see few buttons which have different and important functionalities.\r\nThe functionalities are explained below.\r\n\r\nNew Student: This button will register new student in the library database.\r\n\r\nNew Book: This button will add new book in the library.\r\n\r\nIssue Book: If librarian want to issue book to students to take home, he can do with this button.\r\n\r\nRead Now: Librarian can issue books to read in library using this button.\r\n\r\nReturn Book: Issued books can be returned with help of this button.\r\n\r\nShow Data: This will show the list of issued and returned books.\r\n\r\nAlert: This will show the list of those students whose due date has expired but they have not returned books yet.\r\n\r\nLog Out: You can log out from here.");
		txtpnThisSoftwareIs.setBounds(50, 84, 558, 646);
		panelMessage.add(txtpnThisSoftwareIs);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\background_image.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1539, 864);
		contentPane.add(lblNewLabel_1);
	}
}
