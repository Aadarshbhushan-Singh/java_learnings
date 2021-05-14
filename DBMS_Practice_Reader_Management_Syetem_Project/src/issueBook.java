import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import Project.ConnectionProvider;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class issueBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookId;
	private JTextField txtStudentRegNo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issueBook frame = new issueBook();
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
	public issueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(375, 175, 727, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setForeground(Color.RED);
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookId.setBounds(116, 119, 99, 28);
		contentPane.add(lblBookId);
		
		JLabel lblStudentRegNo = new JLabel("Student Reg No");
		lblStudentRegNo.setForeground(Color.RED);
		lblStudentRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentRegNo.setBounds(116, 171, 154, 28);
		contentPane.add(lblStudentRegNo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Issue Date");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(116, 227, 135, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Due Date");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(116, 280, 99, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtBookId = new JTextField();
		txtBookId.setBackground(new Color(224, 255, 255));
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBookId.setBounds(307, 118, 278, 38);
		contentPane.add(txtBookId);
		txtBookId.setColumns(10);
		
		txtStudentRegNo = new JTextField();
		txtStudentRegNo.setBackground(new Color(224, 255, 255));
		txtStudentRegNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtStudentRegNo.setColumns(10);
		txtStudentRegNo.setBounds(307, 171, 278, 36);
		contentPane.add(txtStudentRegNo);
		
		JDateChooser dateChooserIssueDate = new JDateChooser();
		dateChooserIssueDate.setBounds(307, 227, 278, 36);
		contentPane.add(dateChooserIssueDate);
		
		JDateChooser dateChooserDueDate = new JDateChooser();
		dateChooserDueDate.setBounds(307, 280, 278, 36);
		contentPane.add(dateChooserDueDate);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
				String bookId=txtBookId.getText();
				String studentRegNo=txtStudentRegNo.getText();
				String issueDate=dFormat.format(dateChooserIssueDate.getDate());
				String dueDate=dFormat.format(dateChooserDueDate.getDate());
				String returnBook="No";
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from newBook where bookId='"+bookId+"'");
					if(bookId.length()!=5)
					{
						JOptionPane.showMessageDialog(null, "Please enter vaild book Id.");
					}else if(studentRegNo.length()!=9) {
						JOptionPane.showMessageDialog(null, "Please enter valid student reg no.");
					}else
					{
						if(rs.next())
						{
							ResultSet rs2=st.executeQuery("select * from student where regNo='"+studentRegNo+"'");
							if(rs2.next())
							{
								st.executeUpdate("insert into issue values('"+bookId+"','"+studentRegNo+"','"+issueDate+"','"+dueDate+"','"+returnBook+"')");
								JOptionPane.showMessageDialog(null, "Book successfully issued.");
								setVisible(false);
								new issueBook().setVisible(true);
							}else {
								JOptionPane.showMessageDialog(null, "Invalid student reg no.");
							}
						}else {
							JOptionPane.showMessageDialog(null, "This is book is not available.");
						}
					}
					
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Connection Failed.");
					System.out.println(e2.getMessage());
				}
				
			}
		});
		btnSave.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\issue book.png"));
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSave.setBounds(307, 339, 125, 54);
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setForeground(Color.BLACK);
		btnClose.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnClose.setBounds(460, 339, 125, 54);
		contentPane.add(btnClose);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setForeground(Color.BLUE);
		lblIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIssueBook.setBounds(279, 26, 114, 42);
		contentPane.add(lblIssueBook);
	}
}
