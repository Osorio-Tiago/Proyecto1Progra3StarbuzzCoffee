package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.MainStarbuzz;
import view.viewMenu;

public class ControlMenu implements ActionListener{

	private ControlUsers controlUsers = null;
	private viewMenu viewMenu = new viewMenu();
	
	private static ControlMenu singletonInstance = null;
	
	
	private ControlMenu() { //Contructor privado para respetar el singleton
		this.viewMenu.btnLogout.addActionListener(this);
		this.viewMenu.btnProcessOrder.addActionListener(this);
		this.viewMenu.btonOrderModule.addActionListener(this);
		this.viewMenu.btonUserManagement.addActionListener(this);
	}
	
	
	public static ControlMenu getControlMenu(){
		if(singletonInstance == null){
			singletonInstance = new ControlMenu();
		}
	    return singletonInstance;
    }
	   
	public void setcontrolUsers(ControlUsers controlUsers) {
		this.controlUsers = controlUsers;
	}
	
	
	public void StartApplication() {
		try {
			
			viewMenu.frmStarbuzzCoffee.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void startViewUsers() {
		controlUsers.start();
	}
	
	public void startLogin() {
		new MainStarbuzz();
		MainStarbuzz.main(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == viewMenu.btnLogout) {
			viewMenu.frmStarbuzzCoffee.dispose();
			startLogin();
		}
		else if(e.getSource() == viewMenu.btonUserManagement) {
		viewMenu.frmStarbuzzCoffee.dispose();
		startViewUsers();
		}
		else if(e.getSource() == viewMenu.btnProcessOrder) {
			
		}
		else if(e.getSource() == viewMenu.btonOrderModule) {
			
		}
	}
}