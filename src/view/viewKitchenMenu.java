package view;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;

import controller.ControlMenu;
import model.MainStarbuzz;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class viewKitchenMenu {

	
	public JFrame frmKitchen;
	public JButton btnProcessOrder;
	public JButton btonPendingOrders;
	public JButton btnBack;
	
	/**
	 * Create the application.
	 */
	public viewKitchenMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKitchen = new JFrame();
		frmKitchen.setResizable(false);
		frmKitchen.getContentPane().setBackground(new Color(102, 0, 51));
		frmKitchen
				.setIconImage(Toolkit.getDefaultToolkit().getImage(viewKitchenMenu.class.getResource("/img/coffee-cup.png")));
		frmKitchen.setTitle("StarBuzz Coffee");
		frmKitchen.setBounds(100, 100, 712, 451);
		frmKitchen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKitchen.getContentPane().setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmKitchen.setLocation(dim.width/2-frmKitchen.getSize().width/2, dim.height/2-frmKitchen.getSize().height/2);

		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBorder(UIManager.getBorder("Button.border"));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBack.setBounds(572, 367, 116, 37);
		frmKitchen.getContentPane().add(btnBack);

		btonPendingOrders = new JButton("Pending Orders");
		btonPendingOrders.setBorder(UIManager.getBorder("Button.border"));
		btonPendingOrders.setBackground(Color.LIGHT_GRAY);
		btonPendingOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btonPendingOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btonPendingOrders.setBounds(80, 239, 207, 68);
		frmKitchen.getContentPane().add(btonPendingOrders);

		btnProcessOrder = new JButton("Order History");
		btnProcessOrder.setBorder(UIManager.getBorder("Button.border"));
		btnProcessOrder.setBackground(Color.LIGHT_GRAY);
		btnProcessOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnProcessOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProcessOrder.setBounds(411, 239, 207, 68);
		frmKitchen.getContentPane().add(btnProcessOrder);

		JLabel lblIconMenu = new JLabel("");
		lblIconMenu.setIcon(new ImageIcon(viewKitchenMenu.class.getResource("/img/StarbuzzDoubleLogo.png")));
		lblIconMenu.setBounds(195, 10, 318, 183);
		frmKitchen.getContentPane().add(lblIconMenu);
	}
}
