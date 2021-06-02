package controller;

import view.viewMenu;

public class ControlMenu {

	public void StartApplication() {
		try {
			viewMenu window = new viewMenu();
			window.frmStarbuzzCoffee.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}