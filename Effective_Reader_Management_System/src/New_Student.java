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
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import Project.ConnectionProvider;
public class New_Student extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtRegNo;
	private JTextField txtFathersName;
	private JTextField txtMobileNo;
	private JTextField txtAdress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Student frame = new New_Student();
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
	public New_Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 624, 585);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(66, 77, 90, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblRegNo = new JLabel("Reg No");
		lblRegNo.setForeground(Color.RED);
		lblRegNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRegNo.setBounds(66, 123, 90, 33);
		contentPane.add(lblRegNo);
		
		JLabel lblFathersName = new JLabel("Fathers Name");
		lblFathersName.setForeground(Color.RED);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFathersName.setBounds(66, 176, 146, 33);
		contentPane.add(lblFathersName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setForeground(Color.RED);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDateOfBirth.setBounds(66, 226, 146, 33);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(Color.RED);
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCourse.setBounds(66, 279, 90, 33);
		contentPane.add(lblCourse);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(Color.RED);
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBranch.setBounds(66, 333, 90, 33);
		contentPane.add(lblBranch);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setForeground(Color.RED);
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMobileNo.setBounds(66, 380, 146, 33);
		contentPane.add(lblMobileNo);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setForeground(Color.RED);
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdress.setBounds(66, 430, 146, 33);
		contentPane.add(lblAdress);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtName.setBounds(269, 87, 269, 33);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtRegNo = new JTextField();
		txtRegNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtRegNo.setColumns(10);
		txtRegNo.setBounds(269, 133, 269, 33);
		contentPane.add(txtRegNo);
		
		txtFathersName = new JTextField();
		txtFathersName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFathersName.setColumns(10);
		txtFathersName.setBounds(269, 186, 269, 33);
		contentPane.add(txtFathersName);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMobileNo.setColumns(10);
		txtMobileNo.setBounds(269, 380, 269, 33);
		contentPane.add(txtMobileNo);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdress.setColumns(10);
		txtAdress.setBounds(269, 430, 269, 33);
		contentPane.add(txtAdress);
		
		JDateChooser dateDateOfBirth = new JDateChooser();
		dateDateOfBirth.setBounds(269, 240, 269, 33);
		contentPane.add(dateDateOfBirth);
		
		JComboBox comboBoxBranch = new JComboBox();
		comboBoxBranch.setBounds(269, 333, 269, 33);
		contentPane.add(comboBoxBranch);
		
		JComboBox comboBoxCourse = new JComboBox();
		comboBoxCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxCourse.getSelectedItem().equals("B-Tech"))
				{
					comboBoxBranch.removeAllItems();
					comboBoxBranch.setSelectedItem(null);
					comboBoxBranch.addItem("Computer Engineering");
					comboBoxBranch.addItem("Mechanical Engineering");
					comboBoxBranch.addItem("Electrical Engineering");
					comboBoxBranch.addItem("Civil Engineering");
				}else if(comboBoxCourse.getSelectedItem().equals("BBA"))
				{
					comboBoxBranch.removeAllItems();
					comboBoxBranch.setSelectedItem(null);
					comboBoxBranch.addItem("Major in Accounts");
					comboBoxBranch.addItem("Major in Business");
					comboBoxBranch.addItem("Major in Economics");
				}
			}
		});
		comboBoxCourse.setModel(new DefaultComboBoxModel(new String[] {"", "B-Tech", "BBA"}));
		comboBoxCourse.setBounds(269, 288, 269, 33);
		contentPane.add(comboBoxCourse);
		
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String stdName=txtName.getText();
				String regNo=txtRegNo.getText();
				String fathersName=txtFathersName.getText();
				SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
				String dateOfBirth=dFormat.format(dateDateOfBirth.getDate());
				String courseName=(String)comboBoxCourse.getSelectedItem();
				String branchName=(String)comboBoxBranch.getSelectedItem();
				String mobileNo=txtMobileNo.getText();
				String adress=txtAdress.getText();
				
				if(stdName.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Name cannot be null!");
				}else if(regNo.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Reg No cannot be null!");
				}else if(regNo.length()!=9)
				{
					JOptionPane.showMessageDialog(null, "Reg No should be of length 9!");
				}else if(dateOfBirth.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Invalid Date of Birth!");
				}else if(courseName.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please select course.");
				}else if(branchName.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please select branch.");
				}else if(mobileNo.equals("")){
					JOptionPane.showMessageDialog(null, "Mobile No cannot be null!");
				}
				else if(mobileNo.length()!=10)
				{
					JOptionPane.showMessageDialog(null, "Mobile No. should be of length 10.");
				}else {
					try {
						Connection con=ConnectionProvider.getCon();
						Statement st=con.createStatement();
						st.executeUpdate("insert into student values('"+stdName+"','"+regNo+"','"+fathersName+"','"+dateOfBirth+"','"+courseName+"','"+branchName+"','"+mobileNo+"','"+adress+"')");
						JOptionPane.showMessageDialog(null, "Successfully Updated");
						setVisible(false);
						new New_Student().setVisible(true);
					}catch(Exception e1)
					{	
						JOptionPane.showMessageDialog(null, "Student has already been added.");
						System.out.println(e1.getMessage());
					}
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\save-icon--1.png"));
		btnSave.setBounds(269, 486, 124, 40);
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setBounds(414, 486, 124, 40);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_1 = new JLabel("New Student Registeration");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(158, 10, 316, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnShowBooks = new JButton("Show All Students");
		btnShowBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Show_Available_Students().setVisible(true);
			}
		});
		btnShowBooks.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnShowBooks.setBounds(279, 536, 247, 35);
		contentPane.add(btnShowBooks);
	}
}
