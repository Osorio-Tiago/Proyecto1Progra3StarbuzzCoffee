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
		frmUsers.setResizable(false);
		frmUsers.setTitle("User Manager");
		frmUsers.setBounds(100, 100, 450, 300);
		frmUsers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUsers.getContentPane().setLayout(null);

		JLabel lbFullName = new JLabel("Full Name:");
		lbFullName.setBounds(67, 92, 124, 14);
		frmUsers.getContentPane().add(lbFullName);

		JLabel lbUser = new JLabel("User:");
		lbUser.setBounds(89, 129, 72, 14);
		frmUsers.getContentPane().add(lbUser);

		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setBounds(78, 154, 99, 14);
		frmUsers.getContentPane().add(lbPassword);

		textName = new JTextField();
		textName.setBounds(180, 89, 86, 20);
		frmUsers.getContentPane().add(textName);
		textName.setColumns(10);

		textUser = new JTextField();
		textUser.setBounds(180, 120, 86, 20);
		frmUsers.getContentPane().add(textUser);
		textUser.setColumns(10);

		textPassword = new JTextField();
		textPassword.setBounds(180, 151, 86, 20);
		frmUsers.getContentPane().add(textPassword);
		textPassword.setColumns(10);

		btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreate.setBounds(26, 199, 89, 23);
		frmUsers.getContentPane().add(btnCreate);

		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(228, 199, 89, 23);
		frmUsers.getContentPane().add(btnUpdate);

		btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRead.setBounds(125, 199, 89, 23);
		frmUsers.getContentPane().add(btnRead);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(327, 199, 89, 23);
		frmUsers.getContentPane().add(btnDelete);

		textId = new JTextField();
		textId.setBounds(180, 53, 86, 20);
		frmUsers.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel lbIDUser = new JLabel("ID User:");
		lbIDUser.setBounds(78, 56, 124, 14);
		frmUsers.getContentPane().add(lbIDUser);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(327, 239, 89, 23);
		frmUsers.getContentPane().add(btnBack);
		
	}
}
