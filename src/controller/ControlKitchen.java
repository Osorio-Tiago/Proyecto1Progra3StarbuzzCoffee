package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ConsultasDAOImp;
import model.Request;
import view.viewKitchenMenu;
import view.viewPendientes;

public class ControlKitchen implements ActionListener{

	private viewKitchenMenu viewKitchen = new viewKitchenMenu();
	
	private static ControlKitchen singletonInstance = null;
	
	
	private ControlKitchen() { //Contructor privado para respetar el singleton
		this.viewKitchen.btonPendingOrders.addActionListener(this);
		this.viewKitchen.btnProcessOrder.addActionListener(this);
		this.viewKitchen.btnBack.addActionListener(this);
	}
	
	
	public static ControlKitchen getControlMenu(){
		if(singletonInstance == null){
			singletonInstance = new ControlKitchen();
		}
	    return singletonInstance;
    }
	   
	
	public void StartApplication() {
		try {
			
			viewKitchen.frmKitchen.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public void startPrincipalMenu() {
		ControlMenu menu = ControlMenu.getControlMenu();
		this.viewKitchen.frmKitchen.dispose();
		menu.StartApplication();
	}

	public void startPendingOrders() {
		
		Request request = new Request();
		ConsultasDAOImp consulta = new ConsultasDAOImp();
		viewPendientes view = new viewPendientes();
		controlConsultas control = new controlConsultas(request, consulta, view);
		control.start();
		view.frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == viewKitchen.btonPendingOrders) {
			viewKitchen.frmKitchen.dispose();
			startPendingOrders();
		}
		else if(e.getSource() == viewKitchen.btnProcessOrder) {
			
		}
		else if(e.getSource() == viewKitchen.btnBack) {
			viewKitchen.frmKitchen.dispose();
			startPrincipalMenu();
		}
	}
}