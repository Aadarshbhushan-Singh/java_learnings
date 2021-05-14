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
import com.toedter.calendar.JYearChooser;

import Project.ConnectionProvider;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProvider;
public class New_Book extends JFrame {

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
					New_Book frame = new New_Book();
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
	public New_Book() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 624, 585);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("Book Id");
		lblBookName.setBounds(78, 83, 141, 33);
		lblBookName.setForeground(Color.RED);
		lblBookName.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblBookName);
		
		JLabel lblBookName_1 = new JLabel("Book Name");
		lblBookName_1.setBounds(78, 140, 135, 33);
		lblBookName_1.setForeground(Color.RED);
		lblBookName_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblBookName_1);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setBounds(78, 202, 108, 33);
		lblPublisher.setForeground(Color.RED);
		lblPublisher.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPublisher);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(78, 263, 90, 33);
		lblAuthor.setForeground(Color.RED);
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblAuthor);
		
		JLabel lblPublishedYear = new JLabel("Published Year");
		lblPublishedYear.setBounds(78, 325, 141, 33);
		lblPublishedYear.setForeground(Color.RED);
		lblPublishedYear.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPublishedYear);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(78, 384, 141, 33);
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblPrice);
		
		txtBookId = new JTextField();
		txtBookId.setBounds(282, 83, 269, 33);
		txtBookId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookId.setColumns(10);
		contentPane.add(txtBookId);
		
		txtBookName = new JTextField();
		txtBookName.setBounds(282, 141, 269, 33);
		txtBookName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBookName.setColumns(10);
		contentPane.add(txtBookName);
		
		txtPublisher = new JTextField();
		txtPublisher.setBounds(282, 202, 269, 33);
		txtPublisher.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPublisher.setColumns(10);
		contentPane.add(txtPublisher);
		
		txtAuthor = new JTextField();
		txtAuthor.setBounds(282, 263, 269, 33);
		txtAuthor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAuthor.setColumns(10);
		contentPane.add(txtAuthor);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(282, 384, 269, 33);
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPrice.setColumns(10);
		contentPane.add(txtPrice);
		
		JYearChooser datePublishedYear = new JYearChooser();
		datePublishedYear.setBounds(282, 325, 269, 39);
		datePublishedYear.getSpinner().setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(datePublishedYear);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId=txtBookId.getText();
				String bookName=txtBookName.getText();
				String publisher=txtPublisher.getText();
				String author=txtAuthor.getText();
				SimpleDateFormat dFormat=new SimpleDateFormat("yyyy");
				String publishedYear=dFormat.format(datePublishedYear.getYear());
				String price=txtPrice.getText();
				
				if(bookId.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Book Id cannot be null.");
				}else if(bookId.length()!=5)
				{
					JOptionPane.showMessageDialog(null, "Book Id should be of length 5.");
				}else if(publisher.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Publisher cannot be null.");
				}else if(author.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Author cannot be null.");
				}else if (publishedYear.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Select published year.");
				}else if(price.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter price.");
				}else {
					try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("insert into book values('"+bookId+"','"+bookName+"','"+publisher+"','"+author+"','"+publishedYear+"','"+price+"')");
					System.out.println("Connection Established.");
					JOptionPane.showMessageDialog(null, "Book updated successfully.");
					setVisible(false);
					new New_Book().setVisible(true);
					}catch(Exception e2)
					{
						JOptionPane.showMessageDialog(null, "An error occured.");
						System.out.println(e2.getMessage());
					}
				}
				
			}
		});
		btnSave.setBounds(282, 453, 124, 40);
		btnSave.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\save-icon--1.png"));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(427, 453, 124, 40);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_1 = new JLabel("Add New Book");
		lblNewLabel_1.setBounds(212, 10, 176, 42);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		JButton btnShowBooks = new JButton("Show Available Books");
		btnShowBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Show_Available_Books().setVisible(true);
			}
		});
		btnShowBooks.setBounds(292, 503, 247, 35);
		btnShowBooks.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\issue book.png"));
		btnShowBooks.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnShowBooks);
	}
}
