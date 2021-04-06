package learning_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class login_page extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	
	public login_page()
	{
		initializer();
		connect();
	}
	
	Connection con;
	ResultSet rs;
	PreparedStatement pst;
	
	
	public void connect()
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "helloaadarsh");
			System.out.println("Connection established.");
		}
		catch(Exception e)
		{
			System.out.println("An error occured."+e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_page frame = new login_page();
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
	
	public void initializer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 617);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setBounds(530, 37, 191, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(174, 130, 135, 59);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(174, 224, 135, 59);
		contentPane.add(lblNewLabel_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(455, 141, 378, 34);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(455, 224, 378, 45);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=txtUsername.getText();
				String password=txtPassword.getText();
				
				try {
					String sql="Select * from loginData where userName = '"+username+"' and userPassword='"+password+"'";
					Statement stmt=con.createStatement();
					rs=stmt.executeQuery(sql);
					
					
					
					if(rs.next()==true)
					{
						JOptionPane.showMessageDialog(null, "Login Successful.");
						new frame_1().setVisible(true);
						dispose();
												
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Login Failed.");
					}
		
					
				}catch(Exception e1)
				{
					System.out.println("An error occured in login button."+e1.getMessage());
				}
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnLogin.setBounds(306, 372, 169, 66);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtUsername.setText("");
					txtPassword.setText("");
				}catch(Exception e2)
				{
					System.out.println("An error occured at clear button. "+e2.getMessage());
				}
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnClear.setBounds(664, 372, 169, 66);
		contentPane.add(btnClear);
		
		JButton btnCreateAccount = new JButton("Create New");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=txtUsername.getText();
				String password=txtPassword.getText();
				
				try {
					pst=con.prepareStatement("insert into loginDate(userName, userPassword)values(?,?)");
					pst.setString(1, userName);
					pst.setString(2, password);
					JOptionPane.showMessageDialog(null, "New Accound Created.");
					
				}catch(Exception e3)
				{
					System.out.println("An error occured in create new button. "+e3.getMessage());
				}
				
				
			}
		});
		btnCreateAccount.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnCreateAccount.setBounds(485, 372, 169, 66);
		contentPane.add(btnCreateAccount);
	}
}
