package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.User;
import model.UserDAOImp;
import view.viewUsers;

public class controlUsers implements ActionListener {

	private User modelo;
	private UserDAOImp crud;
	private viewUsers view;

	public controlUsers(User modelo, UserDAOImp crud, viewUsers view) { // Recibe el usuario / CRUD /// VIEW

		this.modelo = modelo;
		this.crud = crud;
		this.view = view;
		this.view.btnCreate.addActionListener(this);
		this.view.btnUpdate.addActionListener(this);
		this.view.btnDelete.addActionListener(this);
		this.view.btnRead.addActionListener(this);
		

	}

	public void start() {

		view.frmUsers.setTitle("User Manager");
		view.frmUsers.setLocationRelativeTo(null);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.btnCreate) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			modelo.setFullName(view.textName.getText());
			modelo.setUser(view.textUser.getText());
			modelo.setPassword(view.textPassword.getText());

			if (crud.create(modelo)) {
				JOptionPane.showMessageDialog(null, "User Saved");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Error to Save");
				clean();
			}

		}

		if (e.getSource() == view.btnUpdate) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			modelo.setFullName(view.textName.getText());
			modelo.setUser(view.textUser.getText());
			modelo.setPassword(view.textPassword.getText());

			if (crud.update(modelo)) {
				JOptionPane.showMessageDialog(null, "User Updated");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Error to update");
				clean();
			}

		}
		
		
		if (e.getSource() == view.btnDelete) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			
			if (crud.delete(modelo)) {
				JOptionPane.showMessageDialog(null, "User Deleted");
				clean();
			} else {
				JOptionPane.showMessageDialog(null, "Error to delete");
				clean();
			}

		}
		
		if (e.getSource() == view.btnRead) {

			modelo.setId(Integer.parseInt(view.textId.getText()));
			
			if (crud.read(modelo)) {
				
				view.textId.setText(String.valueOf(modelo.getId()));
				view.textUser.setText(String.valueOf(modelo.getUser()));
				view.textName.setText(String.valueOf(modelo.getFullName()));
				view.textPassword.setText(String.valueOf(modelo.getPassword()));
	
			} else {
				JOptionPane.showMessageDialog(null, "Error to read");
				clean();
			}

		}
		
	}

	public void clean() {
		view.textId.setText(null);
		view.textName.setText(null);
		view.textPassword.setText(null);
		view.textUser.setText(null);

	}

}
