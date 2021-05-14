import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import Project.ConnectionProvider;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import Project.ConnectionProvider;
import java.sql.*
;public class Issue_Books extends JFrame {

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
					Issue_Books frame = new Issue_Books();
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
	public Issue_Books() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 624, 585);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setForeground(Color.RED);
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookId.setBounds(51, 136, 90, 33);
		contentPane.add(lblBookId);
		
		JLabel lblStudentRegNo = new JLabel("Student Reg No");
		lblStudentRegNo.setForeground(Color.RED);
		lblStudentRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentRegNo.setBounds(51, 182, 185, 33);
		contentPane.add(lblStudentRegNo);
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		lblIssueDate.setForeground(Color.RED);
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIssueDate.setBounds(51, 235, 146, 33);
		contentPane.add(lblIssueDate);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setForeground(Color.RED);
		lblDueDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDueDate.setBounds(51, 285, 146, 33);
		contentPane.add(lblDueDate);
		
		JLabel lblNewLabel_1 = new JLabel("Issue Books");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(199, 42, 161, 42);
		contentPane.add(lblNewLabel_1);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookId.setColumns(10);
		txtBookId.setBounds(282, 136, 290, 33);
		contentPane.add(txtBookId);
		
		txtStudentRegNo = new JTextField();
		txtStudentRegNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStudentRegNo.setColumns(10);
		txtStudentRegNo.setBounds(282, 182, 290, 33);
		contentPane.add(txtStudentRegNo);
		
		JDateChooser dateChooserIssueDate = new JDateChooser();
		dateChooserIssueDate.setBounds(282, 233, 290, 42);
		contentPane.add(dateChooserIssueDate);
		
		JDateChooser dateChooserDueDate = new JDateChooser();
		dateChooserDueDate.setBounds(282, 289, 290, 42);
		contentPane.add(dateChooserDueDate);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.addActionListener(new ActionListener() {
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
					ResultSet rs=st.executeQuery("select * from book where bookId='"+bookId+"'");
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
								new Issue_Books().setVisible(true);
							}else {
								JOptionPane.showMessageDialog(null, "Invalid student reg no.");
							}
						}else {
							JOptionPane.showMessageDialog(null, "This is book is not available.");
						}
					}
					
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, "This book has already been issued.");
					System.out.println(e2.getMessage());
				}
			}
		});
		btnIssue.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\issue.png"));
		btnIssue.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIssue.setBounds(282, 367, 156, 59);
		contentPane.add(btnIssue);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(448, 367, 124, 59);
		contentPane.add(btnClose);
		
		
	}
}
