import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alert extends JFrame {

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
					Alert frame = new Alert();
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
	public Alert() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select readNow.studentRegNo, student.stdName, readNow.bookId, book.bookName, readNow.issueTime, readNow.dueTime from student inner join book inner join readNow where book.bookId=readNow.bookId and student.regNo=readNow.studentRegNo and readNow.returnBook='No'");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					ResultSet rs2=st.executeQuery("select issue.studentRegNo, student.stdName, issue.bookId, book.bookName, issue.issueDate, issue.dueDate from student inner join book inner join issue where book.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='No'");
					table2.setModel(DbUtils.resultSetToTableModel(rs2));
				}catch(Exception e6)
				{
					System.out.println(e6.getMessage());
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 125, 924, 638);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data of Issued and Returned Books");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(275, 10, 335, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Issued Books Take Home");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(346, 55, 256, 28);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 86, 758, 225);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("Issued Books Take Read Now");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(336, 321, 256, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(66, 352, 758, 225);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setColumnHeaderView(table2);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnNewButton.setBounds(706, 587, 118, 41);
		contentPane.add(btnNewButton);
	}
}
