package model;

import controller.ControlLogin;
import view.viewLogin;

public class MainStarbuzz {

	public static void main(String[] args) {
		
		User usuario = new User();
		viewLogin view = new viewLogin();
		Login log = new Login();
		ControlLogin controlLogin = new ControlLogin(usuario, log, view);
		controlLogin.start();
		view.frmLogin.setVisible(true);
	}
}