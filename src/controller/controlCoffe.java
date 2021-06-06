package controller;

import model.Coffe;

import model.Order;
import model.OrderDAOImp;
import model.Request;
import model.RequestDAOImp;
import view.ViewOrderModule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import coffes.*;

/*
 * 1 - Esta clase controlador se encarga de gestionar los procesos logicos y contiene los controles de las vistas....
 * 
 * 
 * 
 * */

public class controlCoffe implements ActionListener, MouseListener {

	private ViewOrderModule viewCoffes;

	private Coffe modelCoffe;

	private Order modelOrder;
	private OrderDAOImp orderImp;

	private Request modelRequest;
	private RequestDAOImp requestImp;

	public controlCoffe(Coffe modelCoffe, view.ViewOrderModule viewCoffes, Order modelOrder,
			OrderDAOImp orderImp, Request modelRequest, RequestDAOImp requestImp) {

		super();
		this.modelCoffe = modelCoffe;

		this.viewCoffes = viewCoffes;
		this.modelOrder = modelOrder;
		this.orderImp = orderImp;
		this.modelRequest = modelRequest;
		this.requestImp = requestImp;

		this.viewCoffes.btnAdd.addActionListener(this);
		this.viewCoffes.btnSave.addActionListener(this);
		this.viewCoffes.btnUpdate.addActionListener(this);
		this.viewCoffes.btnDelete.addActionListener(this);
		this.viewCoffes.comboBox.addActionListener(this);
		this.viewCoffes.rdSoy.addActionListener(this);
		this.viewCoffes.rdMocha.addActionListener(this);
		this.viewCoffes.rdSteamed.addActionListener(this);
		this.viewCoffes.rdWhipped.addActionListener(this);
		this.viewCoffes.table.addMouseListener(this);
		this.viewCoffes.btnBack.addActionListener(this);
		
	}

	public void start() {

		viewCoffes.frmStarbuzzCoffee.setTitle("Coffes");
		viewCoffes.frmStarbuzzCoffee.setLocationRelativeTo(null);
	}

	Beverage coffeeB = null;
	ArrayList<Order> listOrders = new ArrayList<Order>();
	String detalleRequest = "";
	double costRequest = 0;
	String mensaje = "";
	int a=0;
	
	
	public void setJRadioF() {
		viewCoffes.rdSoy.setSelected(false);
		viewCoffes.rdMocha.setSelected(false);
		viewCoffes.rdSteamed.setSelected(false);
		viewCoffes.rdWhipped.setSelected(false);

	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == viewCoffes.btnAdd) {
			
			viewCoffes.textOrder.setText(""); //Cada que comienza una nueva orden se limpia el texto de "Factura"
			
			// Agregar comentarios
			modelCoffe.setSoya("NO");
			modelCoffe.setMocha("NO");
			modelCoffe.setSteamed("NO");
			modelCoffe.setWhipped("NO");

			if (viewCoffes.comboBox.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(null, "Please enter coffe base", "Error!", JOptionPane.ERROR_MESSAGE);

			} else {

				switch (viewCoffes.comboBox.getSelectedItem().toString()) {
				case "HouseBled": {
					modelCoffe.setCafe("HouseBled");
					coffeeB = new HouseBlend();
					break;
				}
				case "DarkRoast": {
					coffeeB = new DarkRoast();
					break;
				}
				case "Decaf": {
					coffeeB = new Decaf();
					break;
				}
				case "Espresso": {
					coffeeB = new Espresso();
					break;
				}
				default: {
					System.out.println("Error Decorator");
					break;
				}
				}

				if (viewCoffes.rdSoy.isSelected()) {
					modelCoffe.setSoya("YES");
					coffeeB = new Soy(coffeeB);
				}

				if (viewCoffes.rdMocha.isSelected()) {
					modelCoffe.setMocha("YES");
					coffeeB = new Mocha(coffeeB);
				}

				if (viewCoffes.rdSteamed.isSelected()) {
					modelCoffe.setSteamed("YES");
					coffeeB = new SteamedMilk(coffeeB);
				}

				if (viewCoffes.rdWhipped.isSelected()) {
					modelCoffe.setWhipped("YES");
					coffeeB = new WhippedMilk(coffeeB);
				}

				
				modelOrder.setId(a);
				modelOrder.setDetail(coffeeB.getDescription());
				modelOrder.setCost(coffeeB.cost());
				modelOrder.setStatus("Recibiendo");
				a++;
				
				listOrders.add(new Order(modelOrder.getDetail(), modelOrder.getCost(), modelOrder.getStatus()));

				// System.out.println(modelOrder.getId());

				String str1 = Integer.toString(modelOrder.getId());

				// modelCoffe
				String data[] = {  str1, viewCoffes.comboBox.getSelectedItem().toString(), modelCoffe.getSoya(),
						modelCoffe.getMocha(), modelCoffe.getSteamed(), modelCoffe.getWhipped() };

				// End modelCoffe
				viewCoffes.tblModel = (DefaultTableModel) viewCoffes.table.getModel();

				viewCoffes.tblModel.addRow(data);
				
				
				setJRadioF(); //Desmarca todos los JRadio btn cada que agrega un cafe
				JOptionPane.showMessageDialog(null, "Data added Sucessfully ", "Succes!", JOptionPane.INFORMATION_MESSAGE);
			}

		}



		else if (e.getSource() == viewCoffes.btnUpdate) {

			viewCoffes.tblModel = (DefaultTableModel) viewCoffes.table.getModel();

			if (viewCoffes.table.getSelectedRowCount() == 1) {

				// modelCoffe
				modelCoffe.setCafe(viewCoffes.comboBox.getSelectedItem().toString());

				switch (viewCoffes.comboBox.getSelectedItem().toString()) {
				case "HouseBled": {

					coffeeB = new HouseBlend();

					break;
				}
				case "DarkRoast": {
					coffeeB = new DarkRoast();
					break;
				}
				case "Decaf": {
					coffeeB = new Decaf();
					break;
				}
				case "Espresso": {
					coffeeB = new Espresso();
					break;
				}
				default: {
					System.out.println("Error Decorator");
					break;
				}
				}

				if (viewCoffes.rdSoy.isSelected()) {
					modelCoffe.setSoya("YES");// modelCoffe
					coffeeB = new Soy(coffeeB);
				} else {
					modelCoffe.setSoya("NO");// modelCoffe
				}

				if (viewCoffes.rdMocha.isSelected()) {
					modelCoffe.setMocha("YES");// modelCoffe
					coffeeB = new Mocha(coffeeB);
				} else {
					modelCoffe.setMocha("NO");// modelCoffe
				}

				if (viewCoffes.rdSteamed.isSelected()) {
					modelCoffe.setSteamed("YES");// modelCoffe
					coffeeB = new SteamedMilk(coffeeB);
				} else {
					modelCoffe.setSteamed("NO");// modelCoffe
				}

				if (viewCoffes.rdWhipped.isSelected()) {
					modelCoffe.setWhipped("YES");// modelCoffe
					coffeeB = new WhippedMilk(coffeeB);
				} else {
					modelCoffe.setWhipped("NO");// modelCoffe
				}

				// modelCoffe
				viewCoffes.tblModel.setValueAt(modelCoffe.getCafe(), viewCoffes.table.getSelectedRow(), 1);
				viewCoffes.tblModel.setValueAt(modelCoffe.getSoya(), viewCoffes.table.getSelectedRow(), 2);
				viewCoffes.tblModel.setValueAt(modelCoffe.getMocha(), viewCoffes.table.getSelectedRow(), 3);
				viewCoffes.tblModel.setValueAt(modelCoffe.getSteamed(), viewCoffes.table.getSelectedRow(), 4);
				viewCoffes.tblModel.setValueAt(modelCoffe.getWhipped(), viewCoffes.table.getSelectedRow(), 5);



				int row = viewCoffes.table.getSelectedRow();
				int id = Integer.parseInt(viewCoffes.tblModel.getValueAt(row, 0).toString());
				listOrders.set(id, modelOrder);
				
				modelOrder.setId(id);
				modelOrder.setDetail(coffeeB.getDescription());
				modelOrder.setCost(coffeeB.cost());
				modelOrder.setStatus("Recibiendo");

				setJRadioF();
	//			orderImp.update(modelOrder);
	//			JOptionPane.showMessageDialog(viewCoffes.btnUpdate, "Update Sucessfully");

			}

		}
		
		
		else if (e.getSource() == viewCoffes.btnDelete) {

			viewCoffes.tblModel = (DefaultTableModel) viewCoffes.table.getModel();

			if (viewCoffes.table.getSelectedRowCount() == 1) {
				int row = viewCoffes.table.getSelectedRow();
				System.out.println(viewCoffes.tblModel.getValueAt(row, 0).toString());
				
				int id = Integer.parseInt(viewCoffes.tblModel.getValueAt(row, 0).toString());
				
				listOrders.remove(id);
				a--;
				viewCoffes.tblModel.removeRow(viewCoffes.table.getSelectedRow());
				setJRadioF();
			} else {
				if (viewCoffes.table.getRowCount() == 0) {
					JOptionPane.showMessageDialog(null, "Table Empty ", "Error!", JOptionPane.ERROR_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, "Please select a single row to delete", "Error!", JOptionPane.ERROR_MESSAGE);

				}
			}

		}
		
		else if (e.getSource() == viewCoffes.btnSave) {

			modelRequest.setTotalDetail(null);
			modelRequest.setTotalCost(0);
			modelRequest.setTotalStatus("Recibiendo");
			
			requestImp.create(modelRequest);

			viewCoffes.textOrder.setText("=======INVOICE=======");
			for (int i = 0; i < listOrders.size(); i++) {
				
				orderImp.create(listOrders.get(i), modelRequest);
				
				detalleRequest = listOrders.get(i).getDetail() + detalleRequest;
				costRequest = listOrders.get(i).getCost() + costRequest;
				
				
				mensaje ="\n------------------\n" +listOrders.get(i).getDetail() + "\n"+ listOrders.get(i).getCost() + mensaje;
				viewCoffes.textOrder.setText(mensaje);
				
			}
			
			viewCoffes.textOrder.setText("=======INVOICE======="+ mensaje +"\n" +"\nTOTAL: \n" + costRequest);
			
			modelRequest.setTotalDetail(detalleRequest);
			modelRequest.setTotalCost(costRequest);
			requestImp.update(modelRequest);
			
			

			if (viewCoffes.tblModel.getRowCount() == 0) {
				JOptionPane.showMessageDialog(null, "The table is empty","Error!", JOptionPane.ERROR_MESSAGE);

			} else {

				for (int i = 0; i < viewCoffes.tblModel.getRowCount(); i++) {// 0 1 2 3 4 son columnas de la tabla

					modelCoffe.setCafe(viewCoffes.tblModel.getValueAt(i, 1).toString());
					modelCoffe.setSoya(viewCoffes.tblModel.getValueAt(i, 2).toString());
					modelCoffe.setMocha(viewCoffes.tblModel.getValueAt(i, 3).toString());
					modelCoffe.setSteamed(viewCoffes.tblModel.getValueAt(i, 4).toString());
					modelCoffe.setWhipped(viewCoffes.tblModel.getValueAt(i, 5).toString());

				

				}

				JOptionPane.showMessageDialog(null, "Order sent to kitchen", "Thanks!", JOptionPane.INFORMATION_MESSAGE);
				// Clean
				viewCoffes.tblModel.setRowCount(0);
				viewCoffes.comboBox.setSelectedItem(-1);
				setJRadioF(); 
				a = 0;
			}

			listOrders.clear();
		}
		
	
		else if (e.getSource() == viewCoffes.btnBack) {
			this.viewCoffes.frmStarbuzzCoffee.dispose();
			
			ControlMenu menu = ControlMenu.getControlMenu();
			menu.StartApplication();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		viewCoffes.tblModel = (DefaultTableModel) viewCoffes.table.getModel();

		String tblCafe = viewCoffes.tblModel.getValueAt(viewCoffes.table.getSelectedRow(), 1).toString();
		String tblSoya = viewCoffes.tblModel.getValueAt(viewCoffes.table.getSelectedRow(), 2).toString();
		String tblMocha = viewCoffes.tblModel.getValueAt(viewCoffes.table.getSelectedRow(), 3).toString();
		String tblSteamed = viewCoffes.tblModel.getValueAt(viewCoffes.table.getSelectedRow(), 4).toString();
		String tblWhipped = viewCoffes.tblModel.getValueAt(viewCoffes.table.getSelectedRow(), 5).toString();

		viewCoffes.comboBox.setSelectedItem(tblCafe);

		if (tblSoya == "YES") {
			viewCoffes.rdSoy.setSelected(true);
		} else {
			viewCoffes.rdSoy.setSelected(false);
		}

		if (tblMocha == "YES") {
			viewCoffes.rdMocha.setSelected(true);
		} else {
			viewCoffes.rdMocha.setSelected(false);
		}

		if (tblSteamed == "YES") {
			viewCoffes.rdSteamed.setSelected(true);
		} else {
			viewCoffes.rdSteamed.setSelected(false);
		}

		if (tblWhipped == "YES") {
			viewCoffes.rdWhipped.setSelected(true);
		} else {
			viewCoffes.rdWhipped.setSelected(false);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
