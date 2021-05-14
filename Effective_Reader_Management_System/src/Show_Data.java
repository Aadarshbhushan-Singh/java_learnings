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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Project.ConnectionProvider;
import java.sql.*
;public class Show_Data extends JFrame {

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
					Show_Data frame = new Show_Data();
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
	public Show_Data() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 125, 924, 638);
		setUndecorated(true);
		contentPane = new JPanel();
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
					try{
//						Working perfectly
//						Connection con=ConnectionProvider.getCon();
//						PreparedStatement pst=con.prepareStatement("select issue.studentRegNo, student.stdName, issue.bookId, newBook.bookName, issue.issueDate, issue.DueDate from student inner join newBook inner join issue where newBook.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='Yes'");
//						ResultSet rs=pst.executeQuery();
//						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						
						//Another way --> 
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select issue.studentRegNo, student.stdName, issue.bookId, book.bookName, issue.issueDate, issue.dueDate from student inner join book inner join issue where book.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='No'");
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						ResultSet rs2=st.executeQuery("select issue.studentRegNo, student.stdName, issue.bookId, book.bookName, issue.issueDate, issue.dueDate from student inner join book inner join issue where book.bookId=issue.bookId and student.regNo=issue.studentRegNo and issue.returnBook='Yes'");
						table2.setModel(DbUtils.resultSetToTableModel(rs2));
						
						
					}catch(Exception e5)
					{
						System.out.println(e5.getMessage());
						System.out.println("Failed.");
					}
					
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data of Issued and Returned Books");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(293, 10, 335, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Issued Books");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(382, 55, 105, 28);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 86, 758, 191);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("Returned Books");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(382, 308, 142, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(84, 339, 758, 191);
		contentPane.add(scrollPane_1);
		
		table2 = new JTable();
		scrollPane_1.setColumnHeaderView(table2);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(720, 555, 122, 31);
		contentPane.add(btnNewButton);
	}
}
