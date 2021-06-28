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
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Dimension;

public class NewStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtDateOfBirth;
	private JTextField txtFathersName;
	private JTextField txtMobileNo;
	private JTextField txtAdress;
	private JTextField txtRegNo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewStudent frame = new NewStudent();
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
	public NewStudent() throws Exception{
		setLocation(new Point(1500, 1000));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(375, 175, 727, 551);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(500, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBackground(Color.WHITE);
		lblName.setForeground(Color.RED);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(31, 73, 216, 41);
		contentPane.add(lblName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(Color.RED);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDateOfBirth.setBounds(31, 175, 216, 41);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setForeground(Color.RED);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFathersName.setBounds(31, 226, 216, 41);
		contentPane.add(lblFathersName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(Color.RED);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourse.setBounds(31, 277, 216, 41);
		contentPane.add(lblCourse);
		
		JLabel lblBranchName = new JLabel("Branch Name");
		lblBranchName.setForeground(Color.RED);
		lblBranchName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBranchName.setBounds(31, 328, 216, 41);
		contentPane.add(lblBranchName);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setForeground(Color.RED);
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNo.setBounds(31, 379, 216, 41);
		contentPane.add(lblMobileNo);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setForeground(Color.RED);
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdress.setBounds(31, 430, 216, 41);
		contentPane.add(lblAdress);
		
		//Combo Box
		JComboBox<String> comboBoxBranch = new JComboBox<String>();
		comboBoxBranch.setBounds(404, 328, 280, 41);
		contentPane.add(comboBoxBranch);
		
		JComboBox<String> comboBoxCourse = new JComboBox<String>();
		comboBoxCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxCourse.getSelectedItem().equals("B-Tech"))
				{
					comboBoxBranch.removeAllItems();
					comboBoxBranch.setSelectedItem(null);
					comboBoxBranch.addItem("Computer Engineering");
					comboBoxBranch.addItem("Civil Engineering");
					comboBoxBranch.addItem("Electrical Engineering");
				}else if(comboBoxCourse.getSelectedItem().equals("BBA"))
				{
					comboBoxBranch.removeAllItems();
					comboBoxBranch.setSelectedItem(null);
					comboBoxBranch.addItem("Commerce");
					comboBoxBranch.addItem("Account");
					comboBoxBranch.addItem("Law Major");
				}
			}
			
		});
		comboBoxCourse.setModel(new DefaultComboBoxModel(new String[] {"", "B-Tech", "BBA"}));
		comboBoxCourse.setBounds(404, 280, 280, 41);
		contentPane.add(comboBoxCourse);
		
		
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtName.setBackground(new Color(224, 255, 255));
		txtName.setBounds(404, 63, 278, 33);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDateOfBirth.setBackground(new Color(224, 255, 255));
		txtDateOfBirth.setColumns(10);
		txtDateOfBirth.setBounds(404, 182, 278, 33);
		contentPane.add(txtDateOfBirth);
		
		txtFathersName = new JTextField();
		txtFathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFathersName.setBackground(new Color(224, 255, 255));
		txtFathersName.setColumns(10);
		txtFathersName.setBounds(404, 233, 278, 33);
		contentPane.add(txtFathersName);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMobileNo.setBackground(new Color(224, 255, 255));
		txtMobileNo.setColumns(10);
		txtMobileNo.setBounds(404, 386, 278, 33);
		contentPane.add(txtMobileNo);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAdress.setBackground(new Color(224, 255, 255));
		txtAdress.setColumns(10);
		txtAdress.setBounds(404, 437, 278, 33);
		contentPane.add(txtAdress);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String studentName=txtName.getText();
				String regNo=txtRegNo.getText();
				String dateOfBirth=txtDateOfBirth.getText();
				String fathersName=txtFathersName.getText();
				String courseName=(String)comboBoxCourse.getSelectedItem();
				String branchName=(String)comboBoxBranch.getSelectedItem();
				String mobileNo=txtMobileNo.getText();
				String adress=txtAdress.getText();
				
				try {
					if(studentName.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Name cannot be null");
					}else if(regNo.length()!=9)
					{
						JOptionPane.showMessageDialog(null, "Reg No should be of length 9.");
					}else if(dateOfBirth.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Date of Birth Cannot be null");
					}else if(dateOfBirth.length()<8)
					{
						JOptionPane.showMessageDialog(null, "Date of birth is not in proper format.");
					}
					else if(courseName.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please select proper course name.");
					}else if(branchName.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please select proper branch name.");
					}else if(mobileNo.length()!=10)
					{
						JOptionPane.showMessageDialog(null, "Mobile no should be of length 10.");
					}
					else {
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						st.executeUpdate("insert into student values('"+studentName+"','"+regNo+"','"+dateOfBirth+"','"+fathersName+"','"+courseName+"','"+branchName+"','"+mobileNo+"','"+adress+"')");
						JOptionPane.showMessageDialog(null, "Successfully Updated");
						setVisible(false);
						new NewStudent().setVisible(true);
						setExtendedState(MAXIMIZED_BOTH);	
					}
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Student's data already exists.");
					setVisible(false);
					try {
						new NewStudent().setVisible(true);
						setExtendedState(MAXIMIZED_BOTH);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
			}
		});
		btnSave.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\DBMSd_Reader_Management_Syetem_Project\\Icons\\save-icon--1.png"));
		btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSave.setForeground(new Color(0, 0, 0));
		btnSave.setBounds(406, 487, 125, 54);
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
		btnClose.setBounds(559, 487, 125, 54);
		contentPane.add(btnClose);
		
		
		
		JLabel lblRegNo = new JLabel("Reg No");
		lblRegNo.setForeground(Color.RED);
		lblRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRegNo.setBackground(Color.WHITE);
		lblRegNo.setBounds(31, 124, 216, 41);
		contentPane.add(lblRegNo);
		
		txtRegNo = new JTextField();
		txtRegNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRegNo.setColumns(10);
		txtRegNo.setBackground(new Color(224, 255, 255));
		txtRegNo.setBounds(404, 124, 278, 33);
		contentPane.add(txtRegNo);
		
		JLabel lblNewLabel = new JLabel("New Student Registeration");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(251, 10, 293, 42);
		contentPane.add(lblNewLabel);
	}
}
