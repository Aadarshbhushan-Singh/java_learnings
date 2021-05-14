import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class Read_Now extends JFrame {

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
					Read_Now frame = new Read_Now();
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
	public Read_Now() {
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
		lblBookId.setBounds(47, 140, 90, 33);
		contentPane.add(lblBookId);
		
		JLabel lblStudentRegNo = new JLabel("Student Reg No");
		lblStudentRegNo.setForeground(Color.RED);
		lblStudentRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentRegNo.setBounds(47, 186, 185, 33);
		contentPane.add(lblStudentRegNo);
		
		JLabel lblIssueTime = new JLabel("Issue Time");
		lblIssueTime.setForeground(Color.RED);
		lblIssueTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIssueTime.setBounds(47, 239, 146, 33);
		contentPane.add(lblIssueTime);
		
		JLabel lblDueTime = new JLabel("Due Time");
		lblDueTime.setForeground(Color.RED);
		lblDueTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDueTime.setBounds(47, 289, 146, 33);
		contentPane.add(lblDueTime);
		
		JLabel lblNewLabel_1 = new JLabel(" Issue to Read Now");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(180, 43, 239, 42);
		contentPane.add(lblNewLabel_1);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookId.setColumns(10);
		txtBookId.setBounds(278, 141, 290, 33);
		contentPane.add(txtBookId);
		
		txtStudentRegNo = new JTextField();
		txtStudentRegNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStudentRegNo.setColumns(10);
		txtStudentRegNo.setBounds(278, 186, 290, 33);
		contentPane.add(txtStudentRegNo);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String studentRegNo=txtStudentRegNo.getText();
				String issueTime=txtIssueTime.getText();
				String dueTime=txtDueTime.getText();
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
								st.executeUpdate("insert into readNow values('"+bookId+"','"+studentRegNo+"','"+issueTime+"','"+dueTime+"','"+returnBook+"')");
								JOptionPane.showMessageDialog(null, "Book successfully issued.");
								setVisible(false);
								new Read_Now().setVisible(true);
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
		btnIssue.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\issue.png"));
		btnIssue.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIssue.setBounds(278, 371, 156, 59);
		contentPane.add(btnIssue);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(444, 371, 124, 59);
		contentPane.add(btnClose);
		
		txtIssueTime = new JTextField();
		txtIssueTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIssueTime.setColumns(10);
		txtIssueTime.setBounds(278, 244, 290, 33);
		contentPane.add(txtIssueTime);
		
		txtDueTime = new JTextField();
		txtDueTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDueTime.setColumns(10);
		txtDueTime.setBounds(278, 289, 290, 33);
		contentPane.add(txtDueTime);
		
		JButton btnData = new JButton("Data");
		btnData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Read_Now_Data().setVisible(true);
			}
		});
		btnData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnData.setBounds(444, 459, 124, 59);
		contentPane.add(btnData);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Return_Read_Book().setVisible(true);
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReturn.setBounds(278, 459, 156, 59);
		contentPane.add(btnReturn);
	}

}
