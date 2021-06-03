package controller;



import view.viewMenu;

public class ControlMenu{

	private controlUsers controlUsers = null;
	private viewMenu viewMenu = new viewMenu();
	
	private static ControlMenu singletonInstance = null;
	
	
	public static ControlMenu getControlMenu(){
		if(singletonInstance == null){
			singletonInstance = new ControlMenu();
		}
	    return singletonInstance;
    }
	   
	public void setcontrolUsers(controlUsers controlUsers) {
		this.controlUsers = controlUsers;
	}
	public void start() {

		viewMenu.frmStarbuzzCoffee.setTitle("StarBuzz Coffee");
		viewMenu.frmStarbuzzCoffee.setLocationRelativeTo(null);
	}
	
	public void StartApplication() {
		try {
			
			viewMenu.frmStarbuzzCoffee.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void StartViewUsers() {
		controlUsers.start();
	}
}