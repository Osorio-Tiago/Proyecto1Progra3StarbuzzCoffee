package view;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

import controller.ControlMenu;
import model.MainStarbuzz;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class viewMenu {

	
	public JFrame frmStarbuzzCoffee;
	
	public JButton btonUserManagement;
	public JButton btnProcessOrder;
	public JButton btonOrderModule;
	public JButton btnLogout;
	
	/**
	 * Create the application.
	 */
	public viewMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStarbuzzCoffee = new JFrame();
		frmStarbuzzCoffee.setResizable(false);
		frmStarbuzzCoffee.getContentPane().setBackground(new Color(102, 0, 51));
		frmStarbuzzCoffee
				.setIconImage(Toolkit.getDefaultToolkit().getImage(viewMenu.class.getResource("/img/coffee-cup.png")));
		frmStarbuzzCoffee.setTitle("StarBuzz Coffee");
		frmStarbuzzCoffee.setBounds(100, 100, 712, 451);
		frmStarbuzzCoffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarbuzzCoffee.getContentPane().setLayout(null);

		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setBorder(UIManager.getBorder("Button.border"));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogout.setBounds(572, 367, 116, 37);
		frmStarbuzzCoffee.getContentPane().add(btnLogout);

		btonOrderModule = new JButton("New Order");
		btonOrderModule.setBorder(UIManager.getBorder("Button.border"));
		btonOrderModule.setBackground(Color.LIGHT_GRAY);
		btonOrderModule.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btonOrderModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btonOrderModule.setBounds(10, 239, 207, 68);
		frmStarbuzzCoffee.getContentPane().add(btonOrderModule);

		btnProcessOrder = new JButton("Process Order");
		btnProcessOrder.setBorder(UIManager.getBorder("Button.border"));
		btnProcessOrder.setBackground(Color.LIGHT_GRAY);
		btnProcessOrder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnProcessOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProcessOrder.setBounds(246, 239, 207, 68);
		frmStarbuzzCoffee.getContentPane().add(btnProcessOrder);

		JLabel lblIconMenu = new JLabel("");
		lblIconMenu.setIcon(new ImageIcon(viewMenu.class.getResource("/img/StarbuzzDoubleLogo.png")));
		lblIconMenu.setBounds(195, 10, 318, 183);
		frmStarbuzzCoffee.getContentPane().add(lblIconMenu);

		btonUserManagement = new JButton("User Management");
		btonUserManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btonUserManagement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btonUserManagement.setBorder(UIManager.getBorder("Button.border"));
		btonUserManagement.setBackground(Color.LIGHT_GRAY);
		btonUserManagement.setBounds(481, 239, 207, 68);
		frmStarbuzzCoffee.getContentPane().add(btonUserManagement);
	}
}
