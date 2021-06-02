package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class viewMenu {

	public JFrame frmStarbuzzCoffee;

		/**
			 * Launch the application.
			 */
				  public static void main(String[] args) { EventQueue.invokeLater(new
				  Runnable() { public void run() { try { viewMenu window = new viewMenu();
				  window.frmStarbuzzCoffee.setVisible(true); } catch (Exception e) {
				  e.printStackTrace(); } } }); }
				 

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
		frmStarbuzzCoffee.getContentPane().setBackground(new Color(102, 0, 51));
		frmStarbuzzCoffee
				.setIconImage(Toolkit.getDefaultToolkit().getImage(viewMenu.class.getResource("/img/coffee-cup.png")));
		frmStarbuzzCoffee.setTitle("StarBuzz Coffee");
		frmStarbuzzCoffee.setBounds(100, 100, 712, 451);
		frmStarbuzzCoffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarbuzzCoffee.getContentPane().setLayout(null);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setBorder(UIManager.getBorder("Button.border"));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogout.setBounds(572, 367, 116, 37);
		frmStarbuzzCoffee.getContentPane().add(btnLogout);

		JButton btonOrderModule = new JButton("New Order");
		btonOrderModule.setBorder(UIManager.getBorder("Button.border"));
		btonOrderModule.setBackground(Color.LIGHT_GRAY);
		btonOrderModule.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btonOrderModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btonOrderModule.setBounds(50, 239, 247, 68);
		frmStarbuzzCoffee.getContentPane().add(btonOrderModule);

		JButton btnProcessOrder = new JButton("Process Order");
		btnProcessOrder.setBorder(UIManager.getBorder("Button.border"));
		btnProcessOrder.setBackground(Color.LIGHT_GRAY);
		btnProcessOrder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnProcessOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProcessOrder.setBounds(401, 239, 247, 68);
		frmStarbuzzCoffee.getContentPane().add(btnProcessOrder);

		JLabel lblIconMenu = new JLabel("");
		lblIconMenu.setIcon(new ImageIcon(viewMenu.class.getResource("/img/StarbuzzDoubleLogo.png")));
		lblIconMenu.setBounds(195, 10, 318, 183);
		frmStarbuzzCoffee.getContentPane().add(lblIconMenu);
	}
}
