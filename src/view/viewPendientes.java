package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

//Esta clase implementa los componentes necesarios para crear la ventana órdenes pendientes.
public class viewPendientes {

	public JFrame frame;
	public JList lista;
	public JButton btnConsultar;
	public DefaultListModel listModel;
	public DefaultTableModel tblPendientes;
	public JTextArea textArea;
	public JButton btnTerminado;
	public JButton btnBack;
	private JScrollPane scrollPane_1;
	
	
	
	
	/**
	 * Create the application.
	 */
	public viewPendientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		frame.setForeground(Color.LIGHT_GRAY);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setTitle("Starbuzz Coffee");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(viewPendientes.class.getResource("/img/coffee-cup.png")));
		frame.getContentPane().setBackground(Color.PINK);
		frame.setResizable(false);
		frame.setBounds(100, 100, 670, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		
	
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(26, 11, 148, 318);
		frame.getContentPane().add(scrollPane_1);
		lista = new JList<>();
		lista.setBounds(26, 11, 148, 318);
		//frame.getContentPane().add(lista);
		scrollPane_1.setViewportView(lista);
		
		
		btnConsultar = new JButton("View Order");
		btnConsultar.setBorder(UIManager.getBorder("Button.border"));
		btnConsultar.setBackground(Color.LIGHT_GRAY);
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(26, 350, 111, 23);
		frame.getContentPane().add(btnConsultar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 10, 256, 319);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnTerminado = new JButton("Order Up");
		btnTerminado.setBorder(UIManager.getBorder("Button.border"));
		btnTerminado.setBackground(Color.LIGHT_GRAY);
		btnTerminado.setBounds(320, 350, 111, 23);
		frame.getContentPane().add(btnTerminado);
		
		JLabel lblIconCoffeeMaker = new JLabel("");
		lblIconCoffeeMaker.setIcon(new ImageIcon(viewPendientes.class.getResource("/img/coffee-maker-64.png")));
		lblIconCoffeeMaker.setBounds(220, 72, 70, 116);
		frame.getContentPane().add(lblIconCoffeeMaker);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBorder(UIManager.getBorder("Button.border"));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(465, 351, 111, 23);
		frame.getContentPane().add(btnBack);
		
		listModel = new DefaultListModel<>();
	}
}
