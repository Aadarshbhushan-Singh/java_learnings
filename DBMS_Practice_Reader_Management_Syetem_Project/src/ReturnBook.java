import java.sql.*;
import Project.ConnectionProvider;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookId;
	private JTextField txtStudentRegNo;
	private JTextField txtIssueDate;
	private JTextField txtDueDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setUndecorated(true);
		setBounds(375, 175, 727, 551);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookId");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(105, 119, 156, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentid = new JLabel("Student Reg No");
		lblStudentid.setForeground(Color.RED);
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentid.setBounds(105, 167, 156, 38);
		contentPane.add(lblStudentid);
		
		JLabel lblNewLabel_1_1 = new JLabel("Issue Date");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(105, 218, 156, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Due Date");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(105, 264, 156, 38);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBookId.setBackground(new Color(224, 255, 255));
		txtBookId.setBounds(271, 119, 272, 38);
		contentPane.add(txtBookId);
		txtBookId.setColumns(10);
		
		txtStudentRegNo = new JTextField();
		txtStudentRegNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtStudentRegNo.setBackground(new Color(224, 255, 255));
		txtStudentRegNo.setColumns(10);
		txtStudentRegNo.setBounds(271, 167, 272, 38);
		contentPane.add(txtStudentRegNo);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String studentRegNo=txtStudentRegNo.getText();
				
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("update issue set returnBook='Yes' where bookId='"+bookId+"' and studentRegNo='"+studentRegNo+"'");
					JOptionPane.showMessageDialog(null, "Book Successfully returned.");
					setVisible(false);
					new ReturnBook().setVisible(true);
				}catch(Exception e4)
				{
					System.out.println(e4.getMessage());
				}
			}
		});
		btnSave.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\save-icon--1.png"));
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSave.setBounds(271, 327, 125, 54);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\red-x-mark-transparent-background-3.png"));
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnCancel.setBounds(418, 327, 125, 54);
		contentPane.add(btnCancel);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String studentRegNo=txtStudentRegNo.getText();

				try {
					if(bookId.length()!=5)
					{
						JOptionPane.showMessageDialog(null, "Please enter valid book Id.");
					}else if(studentRegNo.length()!=9)
					{
						JOptionPane.showMessageDialog(null, "Please enter valid student reg no.");
					}else
					{
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select * from issue where bookId='"+bookId+"' and studentRegNo='"+studentRegNo+"'");
						if(rs.next())
						{
							txtIssueDate.setText(rs.getString(3));
							txtDueDate.setText(rs.getString(4));
							txtIssueDate.setEditable(false);
							txtDueDate.setEditable(false);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Incorrect student reg no or book id.");
							setVisible(false);
							new ReturnBook().setVisible(true);
						}
					}
					
					
				}catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null, "Connection failed");
					System.out.println(e3.getMessage());
				}
			}
		});
		btnSearch.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\search.png"));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearch.setBounds(553, 167, 104, 38);
		contentPane.add(btnSearch);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setForeground(Color.BLUE);
		lblReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblReturnBook.setBounds(237, 21, 140, 42);
		contentPane.add(lblReturnBook);
		
		txtIssueDate = new JTextField();
		txtIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIssueDate.setColumns(10);
		txtIssueDate.setBackground(new Color(224, 255, 255));
		txtIssueDate.setBounds(271, 216, 272, 38);
		contentPane.add(txtIssueDate);
		
		txtDueDate = new JTextField();
		txtDueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDueDate.setColumns(10);
		txtDueDate.setBackground(new Color(224, 255, 255));
		txtDueDate.setBounds(271, 264, 272, 38);
		contentPane.add(txtDueDate);
	}
}
