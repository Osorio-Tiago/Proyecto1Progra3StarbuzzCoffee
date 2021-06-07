package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Label;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.awt.event.ActionEvent;

public class ViewOrderModule {

	public JFrame frmStarbuzzCoffee;
	public JTable table;
	public JButton btnAdd;
	public JButton btnSave;
	public JButton btnUpdate;
	public JButton btnDelete;
	public JComboBox<String> comboBox;
	public JRadioButton rdSoy;
	public JRadioButton rdMocha;
	public JRadioButton rdSteamed;
	public JRadioButton rdWhipped;
	public DefaultTableModel tblModel;
	public JTextArea textOrder;
	public JButton btnBack;
	
	
	/*
	 * Enum para asi poder agregar más cafes a la lista del comboBox sin tener que ir hasta abajo en el código
	 */
	public enum cafecitos {
		 HouseBled,
		 DarkRoast,
		 Decaf,
		 Espresso;
	}
	/*
	 * Metodo para convertir las constantes del Enum en Strings y asi pasarlos al comboBox
	 */
	List<String> enumNames = Stream.of(cafecitos.values())
            .map(Enum::name)
            .collect(Collectors.toList());
	

	/**
	 * Create the application.
	 */
	public ViewOrderModule() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStarbuzzCoffee = new JFrame();
		frmStarbuzzCoffee.setForeground(Color.LIGHT_GRAY);
		frmStarbuzzCoffee.setBackground(Color.LIGHT_GRAY);
		frmStarbuzzCoffee.getContentPane().setBackground(Color.PINK);
		frmStarbuzzCoffee.setIconImage(Toolkit.getDefaultToolkit().getImage(ViewOrderModule.class.getResource("/img/coffee-cup.png")));
		frmStarbuzzCoffee.setTitle("Starbuzz Coffee");
		frmStarbuzzCoffee.setResizable(false);
		frmStarbuzzCoffee.setBounds(100, 100, 933, 411);
		frmStarbuzzCoffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarbuzzCoffee.getContentPane().setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frmStarbuzzCoffee.setLocation(dim.width/2-frmStarbuzzCoffee.getSize().width/2, dim.height/2-frmStarbuzzCoffee.getSize().height/2);
		
		
		
		
		JLabel lbTypeCoffe = new JLabel("Coffee base:");
		lbTypeCoffe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbTypeCoffe.setBounds(27, 27, 118, 30);
		frmStarbuzzCoffee.getContentPane().add(lbTypeCoffe);

		
		
		String[] array = enumNames.toArray(new String[enumNames.size()]);
		comboBox = new JComboBox<String>(array);
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBorder(UIManager.getBorder("Button.border"));
		
	/*	comboBox.setModel(
		new DefaultComboBoxModel<String>(new String[] { "[ - - - - - - - - - ]", "HouseBled", "DarkRoast", "Decaf", "Espresso" }));	*/	
		
		comboBox.setSelectedIndex(-1);
		comboBox.setBounds(155, 31, 130, 29);
		frmStarbuzzCoffee.getContentPane().add(comboBox);

		JLabel lbExtras = new JLabel("Additional:");
		lbExtras.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbExtras.setBounds(27, 105, 106, 30);
		frmStarbuzzCoffee.getContentPane().add(lbExtras);

		rdSoy = new JRadioButton("Soy");
		rdSoy.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		rdSoy.setBackground(Color.PINK);
		rdSoy.setBounds(155, 112, 109, 23);
		frmStarbuzzCoffee.getContentPane().add(rdSoy);

		rdMocha = new JRadioButton("Mocha");
		rdMocha.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		rdMocha.setBackground(Color.PINK);
		rdMocha.setBounds(266, 112, 118, 23);
		frmStarbuzzCoffee.getContentPane().add(rdMocha);

		rdSteamed = new JRadioButton("Steamed Milk");
		rdSteamed.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		rdSteamed.setBackground(Color.PINK);
		rdSteamed.setBounds(390, 112, 118, 23);
		frmStarbuzzCoffee.getContentPane().add(rdSteamed);

		rdWhipped = new JRadioButton("Whipped Milk");
		rdWhipped.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		rdWhipped.setBackground(Color.PINK);
		rdWhipped.setBounds(508, 112, 109, 23);
		frmStarbuzzCoffee.getContentPane().add(rdWhipped);

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(27, 174, 605, 144);
		frmStarbuzzCoffee.getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { 	"idOrden", "Coffe", "Soy", "Mocha", "Steamed Milk", "Whipped Milk" }));
		
		scrollPane.setViewportView(table);

		btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBorder(UIManager.getBorder("Button.border"));

		btnAdd.setBounds(28, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnAdd);

		btnUpdate = new JButton("Update");
		btnUpdate.setBorder(UIManager.getBorder("Button.border"));
		btnUpdate.setBackground(Color.LIGHT_GRAY);

		btnUpdate.setBounds(149, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnUpdate);

		btnDelete = new JButton("Delete");
		btnDelete.setBorder(UIManager.getBorder("Button.border"));
		btnDelete.setBackground(Color.LIGHT_GRAY);

		btnDelete.setBounds(270, 328, 121, 31);
		frmStarbuzzCoffee.getContentPane().add(btnDelete);

		// GUARDAR EN LA BD
		btnSave = new JButton("Save");
		btnSave.setBorder(UIManager.getBorder("Button.border"));
		btnSave.setBackground(Color.LIGHT_GRAY);

		btnSave.setBounds(396, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnSave);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBorder(UIManager.getBorder("Button.border"));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(516, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnBack);
		
		JLabel lblcoffeeImage = new JLabel("");
		lblcoffeeImage.setIcon(new ImageIcon(ViewOrderModule.class.getResource("/img/coffee_coup.png")));
		lblcoffeeImage.setBounds(508, 10, 124, 94);
		frmStarbuzzCoffee.getContentPane().add(lblcoffeeImage);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(665, 27, 245, 330);
		frmStarbuzzCoffee.getContentPane().add(scrollPane_1);

		 textOrder = new JTextArea();
		 textOrder.setBorder(UIManager.getBorder("TextArea.border"));
		 textOrder.setEditable(false);
		scrollPane_1.setViewportView(textOrder);


	}
}