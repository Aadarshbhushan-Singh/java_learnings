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
import java.awt.event.ActionEvent;

public class Delete_Book extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookId;
	private JTextField txtBookName;
	private JTextField txtPublisher;
	private JTextField txtAuthor;
	private JTextField txtPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Book frame = new Delete_Book();
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
	public Delete_Book() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 624, 585);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("Book Id");
		lblBookName.setForeground(Color.RED);
		lblBookName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookName.setBounds(53, 83, 141, 33);
		contentPane.add(lblBookName);
		
		JLabel lblBookName_1 = new JLabel("Book Name");
		lblBookName_1.setForeground(Color.RED);
		lblBookName_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookName_1.setBounds(53, 190, 135, 33);
		contentPane.add(lblBookName_1);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setForeground(Color.RED);
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPublisher.setBounds(53, 252, 108, 33);
		contentPane.add(lblPublisher);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setForeground(Color.RED);
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAuthor.setBounds(53, 313, 90, 33);
		contentPane.add(lblAuthor);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(53, 383, 141, 33);
		contentPane.add(lblPrice);
		
		JLabel lblNewLabel_1 = new JLabel("Add New Book");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(187, 10, 176, 42);
		contentPane.add(lblNewLabel_1);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookId.setColumns(10);
		txtBookId.setBounds(257, 83, 269, 33);
		contentPane.add(txtBookId);
		
		txtBookName = new JTextField();
		txtBookName.setEnabled(false);
		txtBookName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookName.setColumns(10);
		txtBookName.setBounds(257, 191, 269, 33);
		contentPane.add(txtBookName);
		
		txtPublisher = new JTextField();
		txtPublisher.setEnabled(false);
		txtPublisher.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPublisher.setColumns(10);
		txtPublisher.setBounds(257, 252, 269, 33);
		contentPane.add(txtPublisher);
		
		txtAuthor = new JTextField();
		txtAuthor.setEnabled(false);
		txtAuthor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(257, 313, 269, 33);
		contentPane.add(txtAuthor);
		
		txtPrice = new JTextField();
		txtPrice.setEnabled(false);
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPrice.setColumns(10);
		txtPrice.setBounds(257, 384, 269, 33);
		contentPane.add(txtPrice);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String bookName=txtBookName.getText();
				if(bookName.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter valid book Id.");
				}else {
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("delete from book where bookId='"+bookId+"'");
					System.out.println("Connection Established.");
					JOptionPane.showMessageDialog(null, "Book deleted successfully.");
					setVisible(false);
					new Delete_Book().setVisible(true);
					}catch(Exception e2)
					{
						JOptionPane.showMessageDialog(null, "An error occured.");
						System.out.println(e2.getMessage());
					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(257, 453, 124, 40);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(402, 453, 124, 40);
		contentPane.add(btnClose);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();

				try {
					if(bookId.length()!=5)
					{
						JOptionPane.showMessageDialog(null, "Please enter valid book Id.");
					}else
					{
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select * from book where bookId='"+bookId+"'");
						if(rs.next())
						{
							txtBookName.setText(rs.getString(2));
							txtPublisher.setText(rs.getString(3));
							txtAuthor.setText(rs.getString(4));
							txtPrice.setText(rs.getString(6));
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Incorrect book id.");
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
		btnSearch.setBounds(257, 137, 127, 34);
		contentPane.add(btnSearch);
	}
}
