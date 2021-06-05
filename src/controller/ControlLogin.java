package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Login;
import model.User;
import model.UserDAOImp;
import view.viewLogin;
import view.viewUsers;

public class ControlLogin implements ActionListener, KeyListener{

	private User modeloLogin;
	private Login log;
	private viewLogin viewLogin;
	UserDAOImp crud = new UserDAOImp();
	viewUsers viewUsers = new viewUsers();
	
	
	public ControlLogin(User modelo, Login log, viewLogin view) {

		this.modeloLogin = modelo;
		this.log = log;
		this.viewLogin = view;
		this.viewLogin.btnLogin.addActionListener(this);
		this.viewLogin.textUser.addKeyListener(this);
		this.viewLogin.textPassword.addKeyListener(this);
	}

	public void start() {

		viewLogin.frmLogin.setTitle("Login");
		viewLogin.frmLogin.setLocationRelativeTo(null);
	}

	public void queryLogin() {
		modeloLogin.setUser(viewLogin.textUser.getText());
		modeloLogin.setPassword(viewLogin.textPassword.getText());

		if (log.query(modeloLogin)) {

			viewLogin.frmLogin.setVisible(false);
			ControlUsers controlUsers = new ControlUsers(modeloLogin, crud, viewUsers);
			ControlMenu menu = ControlMenu.getControlMenu();
			menu.setcontrolUsers(controlUsers);	
		    JOptionPane.showMessageDialog(null,"logging in...", "Successful!", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("You have successfully log");
			menu.StartApplication();
			
		} else {
			 JOptionPane.showMessageDialog(null,"Wrong username or password", "Login failed", JOptionPane.ERROR_MESSAGE);
			System.out.println("ERROR LOG");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == viewLogin.btnLogin) {
			queryLogin();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		  Character key= e.getKeyChar();
	        if(key.equals('\n'))
	        {
	        	queryLogin();
	        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
