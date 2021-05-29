package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

	//Variables
	private String base = "proyecto";
	private String user  = "root";
	private String password = "1234";
	private String passwordTiago = "7060";
	private String url = "jdbc:mysql://localhost:3306/" + base;
	private Connection con = null; //La variable obtiene la conexion y la guarda
	
	public Connection getConexion() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // Controlador para realizar conexion
			
			try {
				con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
			}catch(SQLException e) {
				con = (Connection) DriverManager.getConnection(this.url, this.user, this.passwordTiago);
			}
			
			
		} catch (SQLException e) {
			System.out.println("Error in the connection with the DB" + e);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null, ex);
		}
		return con;	
	}
}