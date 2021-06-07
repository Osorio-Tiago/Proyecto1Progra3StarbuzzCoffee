package controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import model.UserDAOImp;
import view.viewUsers;

/*
 * Esta clase controlador se encarga de gestionar los procesos lógicos
 *  y contiene los controles de la clase Usuarios y adicionalmente gestiona los eventos
 * que están vinculados a algún componente de la vista.
 * */

public class ControlUsers implements ActionListener {

	private User modelo;
	private UserDAOImp crud;
	private viewUsers view;

	public ControlUsers(User modelo, UserDAOImp crud, viewUsers view) { // Recibe el usuario / CRUD /// VIEW

		this.modelo = modelo;
		this.crud = crud;
		this.view = view;
		this.view.btnCreate.addActionListener(this);
		this.view.btnUpdate.addActionListener(this);
		this.view.btnDelete.addActionListener(this);
		this.view.btnRead.addActionListener(this);
		this.view.btnBack.addActionListener(this);
		
	}

	public void start() {

		view.frmUsers.setTitle("User Manager");
		view.frmUsers.setLocationRelativeTo(null);
		view.frmUsers.setVisible(true);
	}

	@Override
	//Este método permite crear, eliminar o actualizar un usuario.
	public void actionPerformed(ActionEvent e) {
		
        //Al botón de crear se le asigna el evento que permite crear nuevos usuarios para
		//ser ingresados a la base de datos.
		if (e.getSource() == view.btnCreate) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			modelo.setFullName(view.textName.getText());
			modelo.setUser(view.textUser.getText());
			modelo.setPassword(view.textPassword.getText());

			if (crud.create(modelo)) {
				JOptionPane.showMessageDialog(null, "User Saved","Success!", JOptionPane.INFORMATION_MESSAGE);
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Error to Save","Error!", JOptionPane.ERROR_MESSAGE);
				clean();
			}

		}

		//Al botón de actualizar se le asigna el evento que permite modificar información que ya 
		//estaba previamente registrada en la base de datos.
		if (e.getSource() == view.btnUpdate) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			modelo.setFullName(view.textName.getText());
			modelo.setUser(view.textUser.getText());
			modelo.setPassword(view.textPassword.getText());

			if (crud.update(modelo)) {
				JOptionPane.showMessageDialog(null, "User Updated","Success!", JOptionPane.INFORMATION_MESSAGE);
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Error to update","Error!", JOptionPane.ERROR_MESSAGE);
				clean();
			}

		}
		
		//Al botón de borrar  permite eliminar de la base de datos los usuarios previamente
		//registrados.
		if (e.getSource() == view.btnDelete) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			
			if (crud.delete(modelo)) {
				JOptionPane.showMessageDialog(null, "User Deleted","Success!", JOptionPane.INFORMATION_MESSAGE);
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Error to delete","Error!", JOptionPane.ERROR_MESSAGE);
				clean();
			}

		}
		
		//En esta parte del código se creae una función que permite leer los datos que se 
		//encuentran en la base de datos.
		if (e.getSource() == view.btnRead) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			
			if (crud.read(modelo)) {
				
				view.textId.setText(String.valueOf(modelo.getId()));
				view.textUser.setText(String.valueOf(modelo.getUser()));
				view.textName.setText(String.valueOf(modelo.getFullName()));
				view.textPassword.setText(String.valueOf(modelo.getPassword()));
	
			} else {
				JOptionPane.showMessageDialog(null, "Error to read","Error!", JOptionPane.ERROR_MESSAGE);
				clean();
			}

		}
		
		if(e.getSource() == view.btnBack) {
			ControlMenu menu = ControlMenu.getControlMenu();
			view.frmUsers.dispose();
			menu.StartApplication();
		}
		
	}

	//Limpia completamente la información del usuario.
	public void clean() {
		view.textId.setText(null);
		view.textName.setText(null);
		view.textPassword.setText(null);
		view.textUser.setText(null);

	}

}
