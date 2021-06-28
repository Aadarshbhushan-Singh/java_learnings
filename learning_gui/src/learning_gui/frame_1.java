package learning_gui;


import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
public class frame_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookName;
	private JTextField txtEdition;
	private JTextField txtPrice;
	private JTable table;
	private JTextField txtBookId;

	/**
	 * Launch the application.
	 */
	
	public frame_1()
	{
		
		initialize();
		connect();
		table_load();
		
	}
	
	static Connection con;
	PreparedStatement pst;
	ResultSet rs;
	

	public static void connect()
	{
		try {
			String url="jdbc:mysql://localhost:3306/JavaBook";
			Class.forName("com.mysql.cj.jdbc.Driver"); //Mentioning the driver
			con=DriverManager.getConnection(url, "root", "helloaadarsh");
			System.out.println("Connection successful.");
			
		}catch(ClassNotFoundException ex)
		{
			System.out.println("Class not found exception.");
		}catch(SQLException ex)
		{
			System.out.println("SQL Exception.");
		}catch(Exception e)
		{
			System.out.println("An error occured.");
		}
	}
	
	public void table_load()
	{
		try {
			pst=con.prepareStatement("select * from book");
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}catch(Exception e) {
			
			
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame_1 frame = new frame_1();
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
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1271, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(532, 10, 131, 55);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registeration", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(32, 88, 532, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Edition");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 106, 97, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Book Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(20, 57, 97, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(20, 176, 97, 35);
		panel.add(lblNewLabel_1_2);
		
		txtBookName = new JTextField();
		txtBookName.setBounds(177, 57, 275, 30);
		panel.add(txtBookName);
		txtBookName.setColumns(10);
		
		txtEdition = new JTextField();
		txtEdition.setColumns(10);
		txtEdition.setBounds(177, 117, 275, 30);
		panel.add(txtEdition);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(177, 187, 275, 30);
		panel.add(txtPrice);
		
		//Save button
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookName;
				String edition;
				String price;
								
				bookName=txtBookName.getText();
				edition=txtEdition.getText();
				price=txtPrice.getText();
				
				
				try {
					pst=con.prepareStatement("insert into book(name, edition, price)values(?,?,?)");
					pst.setString(1, bookName);
					pst.setString(2, edition);
					pst.setString(3, price);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added!");
					
					//load the table
					table_load();
					
					//Clear the text box
					txtBookName.setText("");
					txtEdition.setText("");
					txtPrice.setText("");
					txtBookName.requestFocus();
					
					
				}catch(Exception e1)
				{
					System.out.println("An error occured.");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(32, 385, 131, 46);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(242, 385, 131, 46);
		contentPane.add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtBookName.setText("");
				txtEdition.setText("");
				txtPrice.setText("");
				txtBookName.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(433, 385, 131, 46);
		contentPane.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(636, 87, 574, 271);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(32, 441, 532, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Book ID");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(68, 15, 97, 35);
		panel_1.add(lblNewLabel_1_3);
		
		txtBookId = new JTextField();
		txtBookId.addKeyListener(new KeyAdapter()
			{
				@Override
				public void keyReleased(KeyEvent e)
				{
					try {
						String id=txtBookId.getText();
						
						pst=con.prepareStatement("select name, edition, price from book where id=?");
						pst.setString(1, id);
						ResultSet rs=pst.executeQuery();
						
						if(rs.next()==true)
						{
							String name=rs.getString(1);
							String edition=rs.getString(2);
							String price=rs.getString(3);
							
							txtBookName.setText(name);
							txtEdition.setText(edition);
							txtPrice.setText(price);							
						}
						else
						{
							txtBookName.setText("");
							txtEdition.setText("");
							txtPrice.setText("");
						}
						
						
					}catch(Exception e2)
					{
						System.out.println("An error occured in textBookId keyListener.");
					}
				}
			});
		txtBookId.setColumns(10);
		txtBookId.setBounds(204, 21, 275, 30);
		panel_1.add(txtBookId);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookName;
				String edition;
				String price;
				String bookId;
								
				bookName=txtBookName.getText();
				edition=txtEdition.getText();
				price=txtPrice.getText();
				bookId=txtBookId.getText();
				
				
				
				try {
					pst=con.prepareStatement("update book set name=?, edition=?, price=? where id=?");
					pst.setString(1, bookName);
					pst.setString(2, edition);
					pst.setString(3, price);
					pst.setString(4, bookId);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Updated!");
					
					//load the table
					table_load();
					
					//Clear the text box
					txtBookName.setText("");
					txtEdition.setText("");
					txtPrice.setText("");
					txtBookName.requestFocus();
					
					
				}catch(Exception e1)
				{
					System.out.println("An error occured.");
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(728, 437, 131, 46);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=txtBookId.getText();
				
				
				try {
					pst=con.prepareStatement("delete from book where id=?");
					pst.setString(1, id);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Deleted!");
					
					//load the table
					table_load();
					
					//Clear the text box
					txtBookName.setText("");
					txtEdition.setText("");
					txtPrice.setText("");
					txtBookName.requestFocus();
					
					
				}catch(Exception e1)
				{
					System.out.println("An error occured.");
				}
				
				
				
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBounds(958, 437, 131, 46);
		contentPane.add(btnDelete);
	}
}
