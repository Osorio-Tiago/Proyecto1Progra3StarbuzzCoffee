package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Login;
import model.User;
import model.UserDAOImp;
import view.viewLogin;
import view.viewUsers;

public class controlLogin implements ActionListener {

	private User modeloLogin;
	private Login log;
	private viewLogin viewLogin;

	UserDAOImp crud = new UserDAOImp();
	viewUsers viewUsers = new viewUsers();

	public controlLogin(User modelo, Login log, viewLogin view) {

		this.modeloLogin = modelo;
		this.log = log;
		this.viewLogin = view;
		this.viewLogin.btnLogin.addActionListener(this);

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

			controlUsers controlUsers = new controlUsers(modeloLogin, crud, viewUsers);
			controlUsers.start();
			System.out.println("You have successfully log");
			viewUsers.frmUsers.setVisible(true);

		} else {
			System.out.println("ERROR LOG");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == viewLogin.btnLogin) {

			queryLogin();

		}

	}

}
