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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Read_Now_Data extends JFrame {

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
					Read_Now_Data frame = new Read_Now_Data();
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
	public Read_Now_Data() {
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
					ResultSet rs=st.executeQuery("select readNow.studentRegNo, student.stdName, readNow.bookId, book.bookName, readNow.issueTime, readNow.dueTime from student inner join book inner join readNow where book.bookId=readNow.bookId and student.regNo=readNow.studentRegNo and readNow.returnBook='No'");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					ResultSet rs2=st.executeQuery("select readNow.studentRegNo, student.stdName, readNow.bookId, book.bookName, readNow.issueTime, readNow.dueTime from student inner join book inner join readNow where book.bookId=readNow.bookId and student.regNo=readNow.studentRegNo and readNow.returnBook='No'");
					table2.setModel(DbUtils.resultSetToTableModel(rs2));
					
					
				}catch(Exception e5)
				{
					System.out.println(e5.getMessage());
					System.out.println("Failed.");
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 125, 924, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data of Issued and Returned Books For Read Now");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(241, 29, 483, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Issued Books");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(376, 74, 105, 28);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 105, 758, 191);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(78, 337, 758, 191);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setColumnHeaderView(table2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Returned Book");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(376, 306, 105, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnNewButton.setBounds(707, 559, 129, 32);
		contentPane.add(btnNewButton);
	}
}
