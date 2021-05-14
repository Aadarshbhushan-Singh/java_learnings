import java.awt.BorderLayout;
import java.sql.*;
import Project.ConnectionProvider;
import net.proteanit.sql.DbUtils;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class statistics extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statistics frame = new statistics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	ResultSet rs2=st.executeQuery("select issue.studentRegNo, student.stdName, issue.bookId, newBook.bookName, issue.issueDate, issue.DueDate from student inner join newBook inner join issue where newBook.bookId=issue.bookId and student.studentRegNo=issue.studentRegNo and issue.returnBook='Yes'");
//	tblReturnDetails.setModel(DbUtils.resultSetToTableModel(rs2));
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */

	
	public statistics() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try{
//					Working perfectly
//					Connection con=ConnectionProvider.getCon();
//					PreparedStatement pst=con.prepareStatement("select issue.studentRegNo, student.stdName, issue.bookId, newBook.bookName, issue.issueDate, issue.DueDate from student inner join newBook inner join issue where newBook.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='Yes'");
//					ResultSet rs=pst.executeQuery();
//					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					//Another way --> 
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select issue.studentRegNo, student.stdName, issue.bookId, newBook.bookName, issue.issueDate, issue.DueDate from student inner join newBook inner join issue where newBook.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='No'");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					ResultSet rs2=st.executeQuery("select issue.studentRegNo, student.stdName, issue.bookId, newBook.bookName, issue.issueDate, issue.DueDate from student inner join newBook inner join issue where newBook.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='Yes'");
					table2.setModel(DbUtils.resultSetToTableModel(rs2));
					
					
				}catch(Exception e5)
				{
					System.out.println(e5.getMessage());
					System.out.println("Failed.");
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(225, 175, 1021, 586);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Issue Details");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(432, 22, 142, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblReturnedDetails = new JLabel("Returned Details");
		lblReturnedDetails.setForeground(Color.RED);
		lblReturnedDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblReturnedDetails.setBounds(416, 236, 177, 36);
		contentPane.add(lblReturnedDetails);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\red-x-mark-transparent-background-3.png"));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(794, 482, 124, 41);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 55, 835, 183);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(83, 284, 835, 167);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setColumnHeaderView(table2);
	}
}
