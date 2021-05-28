package view;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class viewLogin {

	public JFrame frmLogin;
	public JTextField textUser;
	public JTextField textPassword;
	public JButton btnLogin;
	
	
	/**
	 * Create the application.
	 */
	public viewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		textUser = new JTextField();
		textUser.setBounds(186, 74, 147, 34);
		frmLogin.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JLabel lbUser = new JLabel("User:");
		lbUser.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbUser.setBounds(91, 67, 101, 36);
		frmLogin.getContentPane().add(lbUser);
		
		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbPassword.setBounds(46, 137, 136, 36);
		frmLogin.getContentPane().add(lbPassword);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBounds(186, 139, 147, 34);
		frmLogin.getContentPane().add(textPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(177, 203, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
	}
}
