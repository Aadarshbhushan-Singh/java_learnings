import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1360, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginId = new JLabel("Login Id");
		lblLoginId.setForeground(Color.RED);
		lblLoginId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblLoginId.setBounds(512, 337, 190, 38);
		contentPane.add(lblLoginId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.RED);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setBounds(512, 402, 190, 38);
		contentPane.add(lblPassword);
		
		JTextPane txtLogin = new JTextPane();
		txtLogin.setBackground(new Color(224, 255, 255));
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtLogin.setBounds(754, 337, 266, 38);
		contentPane.add(txtLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(224, 255, 255));
		txtPassword.setBounds(754, 411, 266, 38);
		contentPane.add(txtPassword);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnClose.setBounds(884, 482, 136, 51);
		contentPane.add(btnClose);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtLogin.getText().equals("admin") && txtPassword.getText().equals("admin"))
				{
					setVisible(false);
					new Home().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(btnLogin, "Wrong Id or Password");
				}
			}
		});
		btnLogin.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\login.png"));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnLogin.setBounds(749, 482, 125, 51);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\background_image.jpg"));
		lblNewLabel_1.setBounds(10, -61, 1915, 997);
		contentPane.add(lblNewLabel_1);
	}

//	public JLabel getLblNewLabel() {
//		return lblNewLabel;
//	}
}
