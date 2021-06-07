package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
//import java.awt.EventQueue;
//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class viewUsers {

	public JFrame frmUsers;
	public JTextField textName;
	public JTextField textUser;
	public JTextField textPassword;
	public JTextField textId;

	public JButton btnRead;
	public JButton btnCreate;
	public JButton btnDelete;
	public JButton btnUpdate;
	public JButton btnBack;

	/**
	 * Create the application.
	 */
	public viewUsers() {
		initialize();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmUsers.setLocation(dim.width/2-frmUsers.getSize().width/2, dim.height/2-frmUsers.getSize().height/2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {


		frmUsers = new JFrame();
		frmUsers.getContentPane().setBackground(new Color(255, 255, 204));
		frmUsers.setResizable(false);
		frmUsers.setTitle("Manager");
		frmUsers.setBounds(100, 100, 519, 336);
		frmUsers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUsers.getContentPane().setLayout(null);

		JLabel lbFullName = new JLabel("Full Name:");
		lbFullName.setFont(new Font("Arial", Font.BOLD, 12));
		lbFullName.setBounds(23, 92, 124, 14);
		frmUsers.getContentPane().add(lbFullName);

		JLabel lbUser = new JLabel("User:");
		lbUser.setFont(new Font("Arial", Font.BOLD, 12));
		lbUser.setBounds(26, 129, 72, 14);
		frmUsers.getContentPane().add(lbUser);

		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setFont(new Font("Arial", Font.BOLD, 12));
		lbPassword.setBounds(26, 154, 99, 14);
		frmUsers.getContentPane().add(lbPassword);

		textName = new JTextField();
		textName.setBounds(89, 89, 156, 20);
		frmUsers.getContentPane().add(textName);
		textName.setColumns(10);

		textUser = new JTextField();
		textUser.setBounds(89, 126, 156, 20);
		frmUsers.getContentPane().add(textUser);
		textUser.setColumns(10);

		textPassword = new JTextField();
		textPassword.setBounds(89, 151, 156, 20);
		frmUsers.getContentPane().add(textPassword);
		textPassword.setColumns(10);

		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreate.setBounds(75, 193, 89, 23);
		frmUsers.getContentPane().add(btnCreate);

		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(174, 193, 89, 23);
		frmUsers.getContentPane().add(btnUpdate);

		btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRead.setBounds(174, 227, 89, 23);
		frmUsers.getContentPane().add(btnRead);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(75, 227, 89, 23);
		frmUsers.getContentPane().add(btnDelete);

		textId = new JTextField();
		textId.setBounds(89, 53, 156, 20);
		frmUsers.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel lbIDUser = new JLabel("ID User:");
		lbIDUser.setFont(new Font("Arial", Font.BOLD, 12));
		lbIDUser.setBounds(26, 56, 124, 14);
		frmUsers.getContentPane().add(lbIDUser);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(23, 275, 89, 23);
		frmUsers.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 0));
		panel.setBounds(273, 0, 242, 309);
		frmUsers.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(viewUsers.class.getResource("/img/STARBUZZ_sloganReduct.png")));
		lblNewLabel.setBounds(10, 25, 222, 233);
		panel.add(lblNewLabel);
		
	}
}
