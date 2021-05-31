package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Login extends Database implements InterfaceLogin {

	@Override
	public boolean query(User user) {
		Connection con = getConexion();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "Select user, password from user where user=? and password=?";
		 try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUser());
			ps.setString(2, user.getPassword());
			rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			System.err.println("Error Login" + e);
			return false;
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error Login" + e2);
			}
		}
			
	}
	
	
}

 