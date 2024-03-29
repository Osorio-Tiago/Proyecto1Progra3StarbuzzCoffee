package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultListModel;
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

		view.frame.setTitle("Pending orders");
		view.frame.setLocationRelativeTo(null);
		DBConsultOrders();
	}
	
	
	public void DBConsultOrders() {
		List<Request> listRequest = new ArrayList<>();

		listRequest = consultaImp.getRequest(request);
		
		
		for (int i = 0; i < listRequest.size(); i++) {
			view.listModel.addElement(listRequest.get(i).getIdRequest());
			view.lista.setModel(view.listModel);
		}
	}
	
	public void startKitchenModule(){
		ControlKitchen kitchen = ControlKitchen.getControlKitchen();
		kitchen.StartApplication();
	}

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
					mensaje = "\n------------------\n" + listOrders.get(i).getDetail() + "\n$"
							+ listOrders.get(i).getCost() + mensaje;

				}
				view.textArea.setText(mensaje);

				listOrders.clear();
			}
		}

		else if (e.getSource() == view.btnTerminado) {
			
			int seleccion = (int) view.lista.getSelectedValue();
			System.out.println(seleccion);
			request.setIdRequest(seleccion);
			request.setTotalStatus("Terminado");
			consultaImp.setEstadoPendientes(request);
			JOptionPane.showMessageDialog(null, "Order up!", "Ready", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		else if (e.getSource() == view.btnBack) {
			view.frame.dispose();
			startKitchenModule();
		}

	}
}
