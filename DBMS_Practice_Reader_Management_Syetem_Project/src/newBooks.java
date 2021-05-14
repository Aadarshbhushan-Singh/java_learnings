import java.awt.BorderLayout;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class newBooks extends JFrame {

	private JPanel contentPane;
	private JTextField txtBookId;
	private JTextField txtBookName;
	private JTextField txtPublisher;
	private JTextField txtPrice;
	private JTextField txtPublishedYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newBooks frame = new newBooks();
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
	public newBooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(375, 175, 727, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setForeground(Color.RED);
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookId.setBounds(110, 82, 117, 25);
		contentPane.add(lblBookId);
		
		txtBookId = new JTextField();
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBookId.setBackground(new Color(224, 255, 255));
		txtBookId.setBounds(394, 81, 257, 34);
		contentPane.add(txtBookId);
		txtBookId.setColumns(10);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setForeground(Color.RED);
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPublisher.setBounds(110, 194, 117, 25);
		contentPane.add(lblPublisher);
		
		txtBookName = new JTextField();
		txtBookName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBookName.setBackground(new Color(224, 255, 255));
		txtBookName.setColumns(10);
		txtBookName.setBounds(394, 138, 257, 34);
		contentPane.add(txtBookName);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setForeground(Color.RED);
		lblBookName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookName.setBounds(110, 139, 117, 25);
		contentPane.add(lblBookName);
		
		txtPublisher = new JTextField();
		txtPublisher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPublisher.setBackground(new Color(224, 255, 255));
		txtPublisher.setColumns(10);
		txtPublisher.setBounds(394, 193, 257, 34);
		contentPane.add(txtPublisher);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(110, 253, 117, 25);
		contentPane.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPrice.setBackground(new Color(224, 255, 255));
		txtPrice.setColumns(10);
		txtPrice.setBounds(394, 252, 257, 34);
		contentPane.add(txtPrice);
		
		JLabel lblPublishedYear = new JLabel("Published Year");
		lblPublishedYear.setForeground(Color.RED);
		lblPublishedYear.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPublishedYear.setBounds(110, 308, 169, 25);
		contentPane.add(lblPublishedYear);
		
		txtPublishedYear = new JTextField();
		txtPublishedYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPublishedYear.setBackground(new Color(224, 255, 255));
		txtPublishedYear.setColumns(10);
		txtPublishedYear.setBounds(394, 307, 257, 34);
		contentPane.add(txtPublishedYear);
		
		JButton btnSave = new JButton("Save");
		btnSave.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\save-icon--1.png"));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String bookName=txtBookName.getText();
				String publisher=txtPublisher.getText();
				String price=txtPrice.getText();
				String publishedYear=txtPublishedYear.getText();
				if(bookId.length()!=5)
				{
					JOptionPane.showMessageDialog(null, "Book Id should be of length 5.");
				}else if(bookName.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Book Name cannot be null.");
				}else if(publisher.equals("null"))
				{
					JOptionPane.showMessageDialog(null, "Publisher cannot be null.");
				}else if(publishedYear.length()!=4)
				{
					JOptionPane.showMessageDialog(null, "Please enter valid published year.");
				}else {
					try {
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						st.executeUpdate("insert into newBook values('"+bookId+"','"+bookName+"','"+publisher+"','"+price+"','"+publishedYear+"')");
						System.out.println("Connection Established.");
						JOptionPane.showMessageDialog(null, "Book updated successfully.");
						setVisible(false);
						new newBooks().setVisible(true);
						
					} catch (SQLException e1) {
						System.out.println("Connection Failed.");
						JOptionPane.showMessageDialog(null, "This book is already available.");
						setVisible(false);
						new newBooks().setVisible(true);
						e1.printStackTrace();
					}
					
				}
			}
		});
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSave.setBounds(394, 377, 125, 54);
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setForeground(Color.BLACK);
		btnClose.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnClose.setBounds(529, 377, 125, 54);
		contentPane.add(btnClose);
		
		JLabel lblNewBook = new JLabel("New Book");
		lblNewBook.setForeground(Color.BLUE);
		lblNewBook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewBook.setBounds(309, 10, 111, 42);
		contentPane.add(lblNewBook);
	}
}
