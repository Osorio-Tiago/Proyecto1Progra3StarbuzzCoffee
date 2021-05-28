package model;

import controller.controlLogin;
import view.viewLogin;

public class MainStarbuzz {

	public static void main(String[] args) {
		
		User usuario = new User();

		viewLogin view = new viewLogin();
		Login log = new Login();
		controlLogin controlLogin = new controlLogin(usuario, log, view);
		controlLogin.start();
		view.frmLogin.setVisible(true);

	}

}
