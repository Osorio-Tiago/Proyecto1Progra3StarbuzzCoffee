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
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Label;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class viewCoffes {

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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCoffes window = new viewCoffes();
					window.frmStarbuzzCoffee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewCoffes() {
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
		frmStarbuzzCoffee.setIconImage(Toolkit.getDefaultToolkit().getImage(viewCoffes.class.getResource("/img/coffee-cup.png")));
		frmStarbuzzCoffee.setTitle("Starbuzz Coffee");
		frmStarbuzzCoffee.setResizable(false);
		frmStarbuzzCoffee.setBounds(100, 100, 657, 412);
		frmStarbuzzCoffee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarbuzzCoffee.getContentPane().setLayout(null);

		JLabel lbTypeCoffe = new JLabel("Coffee base:");
		lbTypeCoffe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbTypeCoffe.setBounds(27, 27, 118, 30);
		frmStarbuzzCoffee.getContentPane().add(lbTypeCoffe);

		comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBorder(UIManager.getBorder("Button.border"));
		
		
		comboBox.setModel(
				new DefaultComboBoxModel<String>(new String[] { "[ - - - - - - - - - ]", "HouseBled", "DarkRoast", "Decaf", "Espresso" }));		
		comboBox.setSelectedIndex(0);
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
				new String[] { "Coffe", "Soy", "Mocha", "Steamed Milk", "Whipped Milk" }));
		
		scrollPane.setViewportView(table);

		btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBorder(UIManager.getBorder("Button.border"));

//		btnAdd.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				String soya = "NO";
//				String moka = "NO";
//				String steamedMilk = "NO";
//				String whippedMilk = "NO";
//
//				if (comboBox.getSelectedItem().equals("")) {
//					JOptionPane.showMessageDialog(btnAdd, "Pleas enter data");
//
//				} else {
//
//					if (rdSoy.isSelected()) {
//						soya = "YES";
//					}
//
//					if (rdMocha.isSelected()) {
//						moka = "YES";
//					}
//
//					if (rdSteamed.isSelected()) {
//						steamedMilk = "YES";
//					}
//					if (rdWhipped.isSelected()) {
//						whippedMilk = "YES";
//					}
//
//					String data[] = { comboBox.getSelectedItem().toString(), soya, moka, steamedMilk, whippedMilk };
//					DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
//
//					tblModel.addRow(data);
//					JOptionPane.showMessageDialog(btnAdd, "Data added Sucessfully ");
//				}
//
//			}
//		});

		btnAdd.setBounds(28, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnAdd);

		btnUpdate = new JButton("Update");
		btnUpdate.setBorder(UIManager.getBorder("Button.border"));
		btnUpdate.setBackground(Color.LIGHT_GRAY);
//		btnUpdate.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
//
//				if (table.getSelectedRowCount() == 1) {
//
//					String cafe = comboBox.getSelectedItem().toString();
//
//					String soya;
//					String mocha;
//					String steamed;
//					String whipped;
//
//					if (rdSoy.isSelected()) {
//						soya = "YES";
//					} else {
//						soya = "NO";
//					}
//
//					if (rdMocha.isSelected()) {
//						mocha = "YES";
//					} else {
//						mocha = "NO";
//					}
//
//					if (rdSteamed.isSelected()) {
//						steamed = "YES";
//					} else {
//						steamed = "NO";
//					}
//					if (rdWhipped.isSelected()) {
//						whipped = "YES";
//					} else {
//						whipped = "NO";
//					}
//
//					tblModel.setValueAt(cafe, table.getSelectedRow(), 0);
//					tblModel.setValueAt(soya, table.getSelectedRow(), 1);
//					tblModel.setValueAt(mocha, table.getSelectedRow(), 2);
//					tblModel.setValueAt(steamed, table.getSelectedRow(), 3);
//					tblModel.setValueAt(whipped, table.getSelectedRow(), 4);
//
//					JOptionPane.showMessageDialog(btnUpdate, "Update Sucessfully");
//
//				}
//
//			}
//		});
		btnUpdate.setBounds(149, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnUpdate);

		btnDelete = new JButton("Delete");
		btnDelete.setBorder(UIManager.getBorder("Button.border"));
		btnDelete.setBackground(Color.LIGHT_GRAY);
//		btnDelete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
//
//				if (table.getSelectedRowCount() == 1) {
//
//					tblModel.removeRow(table.getSelectedRow());
//
//				} else {
//					if (table.getRowCount() == 0) {
//						JOptionPane.showMessageDialog(btnDelete, "Table Empty ");
//					} else {
//
//						JOptionPane.showMessageDialog(btnDelete, "Please select a single row to delete");
//
//					}
//				}
//
//			}
//		});

		btnDelete.setBounds(270, 328, 121, 31);
		frmStarbuzzCoffee.getContentPane().add(btnDelete);

		// GUARDAR EN LA BD
		btnSave = new JButton("Save");
		btnSave.setBorder(UIManager.getBorder("Button.border"));
		btnSave.setBackground(Color.LIGHT_GRAY);
//		btnSave.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
//				if (tblModel.getRowCount() == 0) {
//
//					JOptionPane.showMessageDialog(btnSave, "The table is empty");
//
//				} else {
//
//					String cafe;
//					String soya;
//					String mocha;
//					String steamed;
//					String whipped;
//
//					try {
//
//						Class.forName("com.mysql.cj.jdbc.Driver");
//						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root",
//								"1234");
//						for (int i = 0; i < tblModel.getRowCount(); i++) {
//
//							cafe = tblModel.getValueAt(i, 0).toString();
//							soya = tblModel.getValueAt(i, 1).toString();
//							mocha = tblModel.getValueAt(i, 2).toString();
//							steamed = tblModel.getValueAt(i, 3).toString();
//							whipped = tblModel.getValueAt(i, 4).toString();
//
//							String sql = "insert into coffe (idOrden,cafe,soya,mocha,steamed,whipped) values(?,?,?,?,?,?)";
//
//							PreparedStatement ps = con.prepareStatement(sql);
//
//							int idOrden = 1;
//
//							ps.setInt(1, idOrden);
//							ps.setString(2, cafe);
//							ps.setString(3, soya);
//							ps.setString(4, mocha);
//							ps.setString(5, steamed);
//							ps.setString(6, whipped);
//
//							ps.execute();
//
//						}
//
//						JOptionPane.showMessageDialog(btnSave, "Data insert on the DB");
//						tblModel.setRowCount(0);
//
//					} catch (SQLException ex) {
//						System.out.println("Error in the connection with the DB" + ex);
//					} catch (ClassNotFoundException e2) {
//						Logger.getLogger(viewCoffes.class.getName()).log(Level.SEVERE, null, e2);
//
//					}
//				}
//
//			}
//
//		});
//
		btnSave.setBounds(396, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorder(UIManager.getBorder("Button.border"));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(516, 328, 116, 31);
		frmStarbuzzCoffee.getContentPane().add(btnBack);
		
		JLabel lblcoffeeImage = new JLabel("");
		lblcoffeeImage.setIcon(new ImageIcon(viewCoffes.class.getResource("/img/coffee_coup.png")));
		lblcoffeeImage.setBounds(508, 10, 124, 94);
		frmStarbuzzCoffee.getContentPane().add(lblcoffeeImage);

//		table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
//
//				String tblCafe = tblModel.getValueAt(table.getSelectedRow(), 0).toString();
//				String tblSoya = tblModel.getValueAt(table.getSelectedRow(), 1).toString();
//				String tblMocha = tblModel.getValueAt(table.getSelectedRow(), 2).toString();
//				String tblSteamed = tblModel.getValueAt(table.getSelectedRow(), 3).toString();
//				String tblWhipped = tblModel.getValueAt(table.getSelectedRow(), 4).toString();
//
//				comboBox.setSelectedItem(tblCafe);
//
//				if (tblSoya == "YES") {
//					rdSoy.setSelected(true);
//				} else {
//					rdSoy.setSelected(false);
//				}
//
//				if (tblMocha == "YES") {
//					rdMocha.setSelected(true);
//				} else {
//					rdMocha.setSelected(false);
//				}
//
//				if (tblSteamed == "YES") {
//					rdSteamed.setSelected(true);
//				} else {
//					rdSteamed.setSelected(false);
//				}
//
//				if (tblWhipped == "YES") {
//					rdWhipped.setSelected(true);
//				} else {
//					rdWhipped.setSelected(false);
//				}
//
//			}
//		});

	}
}