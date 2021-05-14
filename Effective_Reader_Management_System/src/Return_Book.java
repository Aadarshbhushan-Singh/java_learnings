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
import java.awt.event.ActionEvent;

public class Return_Book extends JFrame {

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
					Return_Book frame = new Return_Book();
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
	public Return_Book() {
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
		lblBookId.setBounds(46, 149, 90, 33);
		contentPane.add(lblBookId);
		
		JLabel lblStudentRegNo = new JLabel("Student Reg No");
		lblStudentRegNo.setForeground(Color.RED);
		lblStudentRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentRegNo.setBounds(46, 195, 185, 33);
		contentPane.add(lblStudentRegNo);
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		lblIssueDate.setForeground(Color.RED);
		lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIssueDate.setBounds(46, 282, 146, 33);
		contentPane.add(lblIssueDate);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setForeground(Color.RED);
		lblDueDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDueDate.setBounds(46, 332, 146, 33);
		contentPane.add(lblDueDate);
		
		JLabel lblNewLabel_1 = new JLabel("Return Books");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(211, 55, 161, 42);
		contentPane.add(lblNewLabel_1);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookId.setColumns(10);
		txtBookId.setBounds(257, 150, 290, 33);
		contentPane.add(txtBookId);
		
		txtStudentRegNo = new JTextField();
		txtStudentRegNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStudentRegNo.setColumns(10);
		txtStudentRegNo.setBounds(257, 195, 290, 33);
		contentPane.add(txtStudentRegNo);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String studentRegNo=txtStudentRegNo.getText();
				
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("update issue set returnBook='Yes' where bookId='"+bookId+"' and studentRegNo='"+studentRegNo+"'");
					JOptionPane.showMessageDialog(null, "Book Successfully returned.");
					setVisible(false);
					new Return_Book().setVisible(true);
				}catch(Exception e4)
				{
					System.out.println(e4.getMessage());
				}
			}
		});
		btnReturn.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\return book png.png"));
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReturn.setBounds(257, 414, 156, 59);
		contentPane.add(btnReturn);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(423, 414, 124, 59);
		contentPane.add(btnClose);
		
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
						}
					}
					
					
				}catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null, "Connection failed");
					System.out.println(e3.getMessage());
				}
			}
		});
		btnSearch.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\search.png"));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSearch.setBounds(257, 238, 130, 32);
		contentPane.add(btnSearch);
		
		txtIssueDate = new JTextField();
		txtIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIssueDate.setColumns(10);
		txtIssueDate.setBounds(257, 282, 290, 33);
		contentPane.add(txtIssueDate);
		
		txtDueDate = new JTextField();
		txtDueDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDueDate.setColumns(10);
		txtDueDate.setBounds(257, 327, 290, 33);
		contentPane.add(txtDueDate);
	}
}
