import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Return_Read_Book extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookId;
	private JTextField txtStudentRegNo;
	private JTextField txtIssueTime;
	private JTextField txtDueTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return_Read_Book frame = new Return_Read_Book();
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
	public Return_Read_Book() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 624, 585);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookId.setColumns(10);
		txtBookId.setBounds(274, 105, 290, 33);
		contentPane.add(txtBookId);
		
		txtStudentRegNo = new JTextField();
		txtStudentRegNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStudentRegNo.setColumns(10);
		txtStudentRegNo.setBounds(274, 150, 290, 33);
		contentPane.add(txtStudentRegNo);
		
		txtIssueTime = new JTextField();
		txtIssueTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIssueTime.setColumns(10);
		txtIssueTime.setBounds(274, 237, 290, 33);
		contentPane.add(txtIssueTime);
		
		txtDueTime = new JTextField();
		txtDueTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDueTime.setColumns(10);
		txtDueTime.setBounds(274, 282, 290, 33);
		contentPane.add(txtDueTime);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setForeground(Color.RED);
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookId.setBounds(63, 104, 90, 33);
		contentPane.add(lblBookId);
		
		JLabel lblStudentRegNo = new JLabel("Student Reg No");
		lblStudentRegNo.setForeground(Color.RED);
		lblStudentRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentRegNo.setBounds(63, 150, 185, 33);
		contentPane.add(lblStudentRegNo);
		
		JLabel lblIssueTime = new JLabel("Issue Time");
		lblIssueTime.setForeground(Color.RED);
		lblIssueTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIssueTime.setBounds(63, 237, 146, 33);
		contentPane.add(lblIssueTime);
		
		JLabel lblDueTime = new JLabel("Due Time");
		lblDueTime.setForeground(Color.RED);
		lblDueTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDueTime.setBounds(63, 287, 146, 33);
		contentPane.add(lblDueTime);
		
		JLabel lblNewLabel_1 = new JLabel("Return Books");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(228, 10, 161, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String studentRegNo=txtStudentRegNo.getText();
				
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("update readNow set returnBook='Yes' where bookId='"+bookId+"' and studentRegNo='"+studentRegNo+"'");
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
		btnReturn.setBounds(274, 369, 156, 59);
		contentPane.add(btnReturn);
		
		JButton btnClose = new JButton("Close");
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(440, 369, 124, 59);
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
						ResultSet rs=st.executeQuery("select * from readNow where bookId='"+bookId+"' and studentRegNo='"+studentRegNo+"'");
						if(rs.next())
						{
							txtIssueTime.setText(rs.getString(3));
							txtDueTime.setText(rs.getString(4));
							txtIssueTime.setEditable(false);
							txtDueTime.setEditable(false);
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
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSearch.setBounds(274, 193, 130, 32);
		contentPane.add(btnSearch);
	}
}
