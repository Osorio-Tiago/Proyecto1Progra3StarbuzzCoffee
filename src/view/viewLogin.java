package view;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Cursor;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class viewLogin {

	public JFrame frmLogin;
	public JTextField textUser;
	public JPasswordField textPassword;
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
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(viewLogin.class.getResource("/img/coffee-cup.png")));
		frmLogin.getContentPane().setBackground(Color.decode("#ec5353"));
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 800, 503);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		textUser = new JTextField();
		textUser.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			}
		});
		textUser.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUser.getText().trim().toLowerCase().equals("username")) {
				  textUser.setText("");
				  textUser.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textUser.getText().trim().equals("") || textUser.getText().trim().toLowerCase().equals("username")) {
					  textUser.setText("username"); 
					  textUser.setForeground(Color.GRAY); 
				}
			}
			});
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textUser.setForeground(Color.GRAY);
		textUser.setText("username");
		textUser.setBounds(139, 161, 190, 34);
		frmLogin.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JLabel lbUser = new JLabel();
		lbUser.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbUser.setBounds(26, 147, 61, 54);
		frmLogin.getContentPane().add(lbUser);//iconUser
		
		ImageIcon imgUser = new ImageIcon(getClass().getResource("/img/iconUser.png")); 
	    Icon fondoUser = new ImageIcon( imgUser.getImage().getScaledInstance(lbUser.getWidth(),lbUser.getHeight(), Image.SCALE_DEFAULT)); 
	    lbUser.setIcon(fondoUser);
		
		JLabel lbPassword = new JLabel();
		lbPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbPassword.setBounds(26, 255, 61, 54);
		frmLogin.getContentPane().add(lbPassword);
		
		ImageIcon impPass = new ImageIcon(getClass().getResource("/img/iconLock.png")); 
	    Icon fondoPass = new ImageIcon( impPass.getImage().getScaledInstance(lbPassword.getWidth(),lbPassword.getHeight(), Image.SCALE_DEFAULT)); 
	    lbPassword.setIcon(fondoPass);
		
		textPassword = new JPasswordField();
		textPassword.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			}
		});
		textPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(String.valueOf(textPassword.getPassword()).trim().equals("password")) {
					textPassword.setText("");
					textPassword.setForeground(Color.black); 
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(String.valueOf(textPassword.getPassword()).trim().equals("")) {
					textPassword.setText("password");
					textPassword.setForeground(Color.GRAY);
				}
			}
		});
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPassword.setForeground(Color.GRAY);
		textPassword.setText("password");
		textPassword.setColumns(10);
		textPassword.setBounds(139, 275, 190, 34);
		frmLogin.getContentPane().add(textPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(139, 366, 190, 54);
		frmLogin.getContentPane().add(btnLogin);
		
		JPanel panelIcon = new JPanel();
		panelIcon.setBackground(Color.WHITE);
		panelIcon.setBounds(389, 0, 407, 475);
		frmLogin.getContentPane().add(panelIcon);
		panelIcon.setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(10, 120, 387, 244);
		panelIcon.add(lblIcon);
		
		ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/starbuzzLogoSlogan.png")); 
	    Icon fondo1 = new ImageIcon( imagen1.getImage().getScaledInstance(lblIcon.getWidth(),lblIcon.getHeight(), Image.SCALE_DEFAULT)); 
	    lblIcon.setIcon(fondo1);
	    
	    JTextPane NO_TOCAR = new JTextPane();
	    NO_TOCAR.setEditable(false);
	    NO_TOCAR.setBounds(20, 24, 24, 29);
	    panelIcon.add(NO_TOCAR);
	}
}