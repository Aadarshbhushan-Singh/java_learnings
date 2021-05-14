import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Show_Available_Students extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_Available_Students frame = new Show_Available_Students();
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
	public Show_Available_Students() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from student");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e7)
				{
					JOptionPane.showMessageDialog(null, "Unable to load!");
					System.out.println("Connection Failed");
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 125, 924, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListOfAll = new JLabel("List Of All Students");
		lblListOfAll.setForeground(Color.RED);
		lblListOfAll.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListOfAll.setBounds(330, 21, 227, 35);
		contentPane.add(lblListOfAll);
		
		JLabel lblNewLabel_1 = new JLabel("ELMS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(373, 66, 68, 28);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 104, 809, 442);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\singh\\Desktop\\java\\Effective_Reader_Management_System\\Icons\\red-x-mark-transparent-background-3.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setBounds(744, 556, 115, 35);
		contentPane.add(btnClose);
	}

}
