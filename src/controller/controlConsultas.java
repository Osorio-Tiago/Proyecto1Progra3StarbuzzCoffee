package controller;

/*
 * Esta clase controlConsultas se encarga de gestionar los procesos lógicos
 *  y adicionalmente  maneja los eventos que están relacionados con las consultas en la cocina.
 * */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

import model.ConsultasDAOImp;
import model.Order;
import model.Request;
import view.viewPendientes;

public class controlConsultas implements ActionListener {

	private Request request;
	private ConsultasDAOImp consultaImp;
	private viewPendientes view;
	ArrayList<Order> listOrders = new ArrayList<Order>();

	int idOrder = 0;
	String detalle = "";
	String estado = "";
	String mensaje = "";

	public controlConsultas(Request request, ConsultasDAOImp consultaImp, viewPendientes view) {
		super();
		this.request = request;
		this.consultaImp = consultaImp;
		this.view = view;
		this.view.btnConsultar.addActionListener(this);
		this.view.btnTerminado.addActionListener(this);
		this.view.btnBack.addActionListener(this);
	}
    
	
	public void start() {

		view.frame.setTitle("Pendientes");
		view.frame.setLocationRelativeTo(null);

		

		List<Request> listRequest = new ArrayList<>();

		listRequest = consultaImp.getRequest(request); //Se realiza una consulta sobre los pedidos.

		for (int i = 0; i < listRequest.size(); i++) {
			view.listModel.addElement(listRequest.get(i).getIdRequest()); //Se muestran los pedidos pendientes.
			view.lista.setModel(view.listModel);
		}

	}
	
	
	
	public void startKitchenModule(){
		ControlKitchen kitchen = ControlKitchen.getControlKitchen();
		kitchen.StartApplication();
	}
	
    //Permire consultar las órdenes de los pedidos pendientes.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == view.btnConsultar) {

			if (view.lista.getSelectedIndex() != -1) {
				mensaje = "";

				int seleccion = (int) view.lista.getSelectedValue();
				List<Order> listOrders = new ArrayList<>();
				listOrders = consultaImp.readPendientes(seleccion);

				view.textArea.setText(null);
				for (int i = 0; i < listOrders.size(); i++) {
					mensaje = "\n------------------\n" + listOrders.get(i).getDetail() + "\n"
							+ listOrders.get(i).getCost() + mensaje;

				}

				view.textArea.setText(mensaje);

				listOrders.clear();
			}
		}
		
        //Esta parte del código se relaciona al evento que procede si se da click al botón terminado.
		//El cual cambia el estado del pedido de pendiente a listo, y muestra que la orden está lista.
		if (e.getSource() == view.btnTerminado) {
			
			int seleccion = (int) view.lista.getSelectedValue();
			System.out.println(seleccion);
			request.setIdRequest(seleccion);
			request.setTotalStatus("Terminado");
			consultaImp.setEstadoPendientes(request);
			JOptionPane.showMessageDialog(null, "Order up!", "Ready", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		//Se devuelve al menu principal.
		else if (e.getSource() == view.btnBack) {
			view.frame.dispose();
			startKitchenModule();
		}

	}
}
