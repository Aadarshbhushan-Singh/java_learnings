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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Page extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginId;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
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
	public Login_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 844);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Login Here", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(456, 312, 652, 283);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtLoginId = new JTextField();
		txtLoginId.setBounds(296, 40, 281, 39);
		panel.add(txtLoginId);
		txtLoginId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLoginId.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(296, 112, 281, 37);
		panel.add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("Login Id");
		lblNewLabel.setBounds(70, 33, 153, 49);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(70, 114, 153, 49);
		panel.add(lblPassword);
		lblPassword.setForeground(Color.RED);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginId=txtLoginId.getText();
				String password=txtPassword.getText();
				
				if(loginId.equals("admin") && password.equals("admin"))
				{
					setVisible(false);
					new Home_Page().setVisible(true);
				}else
				{
					JOptionPane.showMessageDialog(null, "Incorrect Id or Password!");
				}
			}
		});
		btnLogin.setBounds(296, 189, 121, 49);
		panel.add(btnLogin);
		btnLogin.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\login.png"));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setBounds(456, 189, 121, 49);
		panel.add(btnClose);
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\background_image.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1539, 864);
		contentPane.add(lblNewLabel_1);
	}
}
