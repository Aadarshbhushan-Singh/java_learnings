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

public class Delete_Students extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtRegNo;
	private JTextField txtFathersName;
	private JTextField txtMobileNo;
	private JTextField txtAdress;
	private JTextField txtDateOfBirth;
	private JTextField txtCourse;
	private JTextField txtBranch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Students frame = new Delete_Students();
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
	public Delete_Students() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 624, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(61, 47, 90, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblRegNo = new JLabel("Reg No");
		lblRegNo.setForeground(Color.RED);
		lblRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRegNo.setBounds(61, 93, 90, 33);
		contentPane.add(lblRegNo);
		
		JLabel lblFathersName = new JLabel("Fathers Name");
		lblFathersName.setForeground(Color.RED);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFathersName.setBounds(61, 176, 146, 33);
		contentPane.add(lblFathersName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(Color.RED);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDateOfBirth.setBounds(61, 226, 146, 33);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(Color.RED);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourse.setBounds(61, 279, 90, 33);
		contentPane.add(lblCourse);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(Color.RED);
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBranch.setBounds(61, 333, 90, 33);
		contentPane.add(lblBranch);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setForeground(Color.RED);
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNo.setBounds(61, 380, 146, 33);
		contentPane.add(lblMobileNo);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setForeground(Color.RED);
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdress.setBounds(61, 430, 146, 33);
		contentPane.add(lblAdress);
		
		JLabel lblNewLabel_1 = new JLabel("New Student Registeration");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(153, 10, 316, 42);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setForeground(Color.GREEN);
		txtName.setEnabled(false);
		txtName.setFont(new Font("Dialog", Font.BOLD, 14));
		txtName.setColumns(10);
		txtName.setBounds(264, 57, 269, 33);
		contentPane.add(txtName);
		
		txtRegNo = new JTextField();
		txtRegNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtRegNo.setColumns(10);
		txtRegNo.setBounds(264, 103, 269, 33);
		contentPane.add(txtRegNo);
		
		txtFathersName = new JTextField();
		txtFathersName.setForeground(Color.GREEN);
		txtFathersName.setEnabled(false);
		txtFathersName.setFont(new Font("Dialog", Font.BOLD, 14));
		txtFathersName.setColumns(10);
		txtFathersName.setBounds(264, 186, 269, 33);
		contentPane.add(txtFathersName);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setForeground(Color.GREEN);
		txtMobileNo.setEnabled(false);
		txtMobileNo.setFont(new Font("Dialog", Font.BOLD, 14));
		txtMobileNo.setColumns(10);
		txtMobileNo.setBounds(264, 380, 269, 33);
		contentPane.add(txtMobileNo);
		
		txtAdress = new JTextField();
		txtAdress.setForeground(Color.GREEN);
		txtAdress.setEnabled(false);
		txtAdress.setFont(new Font("Dialog", Font.BOLD, 14));
		txtAdress.setColumns(10);
		txtAdress.setBounds(264, 430, 269, 33);
		contentPane.add(txtAdress);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setForeground(Color.GREEN);
		txtDateOfBirth.setEnabled(false);
		txtDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 14));
		txtDateOfBirth.setColumns(10);
		txtDateOfBirth.setBounds(264, 234, 269, 33);
		contentPane.add(txtDateOfBirth);
		
		txtCourse = new JTextField();
		txtCourse.setForeground(Color.GREEN);
		txtCourse.setEnabled(false);
		txtCourse.setFont(new Font("Dialog", Font.BOLD, 14));
		txtCourse.setColumns(10);
		txtCourse.setBounds(264, 280, 269, 33);
		contentPane.add(txtCourse);
		
		txtBranch = new JTextField();
		txtBranch.setForeground(Color.GREEN);
		txtBranch.setEnabled(false);
		txtBranch.setFont(new Font("Dialog", Font.BOLD, 14));
		txtBranch.setColumns(10);
		txtBranch.setBounds(264, 333, 269, 33);
		contentPane.add(txtBranch);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String regNo=txtRegNo.getText();

				try {
					if(regNo.length()!=9)
					{
						JOptionPane.showMessageDialog(null, "Please enter valid Reg No.");
					}else
					{
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("select * from student where regNo='"+regNo+"'");
						if(rs.next())
						{
							txtName.setText(rs.getString(1));
							txtFathersName.setText(rs.getString(3));
							txtDateOfBirth.setText(rs.getString(4));
							txtCourse.setText(rs.getString(5));
							txtBranch.setText(rs.getString(6));
							txtMobileNo.setText(rs.getString(7));
							txtAdress.setText(rs.getString(8));
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Incorrect Reg No.");
						}
					}
					
					
				}catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null, "Connection failed");
					System.out.println(e3.getMessage());
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSearch.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\search.png"));
		btnSearch.setBounds(263, 146, 115, 30);
		contentPane.add(btnSearch);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String regNo=txtRegNo.getText();
				String studentName=txtName.getText();
				if(studentName.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter valid Reg No.");
				}else {
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("delete from student where regNo='"+regNo+"'");
					System.out.println("Connection Established.");
					JOptionPane.showMessageDialog(null, "Data deleted successfully.");
					setVisible(false);
					new Delete_Students().setVisible(true);
					}catch(Exception e2)
					{
						JOptionPane.showMessageDialog(null, "An error occured.");
						System.out.println(e2.getMessage());
					}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(264, 481, 124, 40);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(409, 481, 124, 40);
		contentPane.add(btnClose);
	}
}
