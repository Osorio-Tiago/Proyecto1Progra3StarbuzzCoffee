package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImp extends Database implements UserDAO {

	@Override
	public boolean create(User user) {

		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "INSERT INTO user (id, name, user, password) VALUES(?,?,?,?)";

		try {

			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getFullName());
			ps.setString(3, user.getUser());
			ps.setString(4, user.getPassword());
			ps.execute();
			return true;
			
		} catch (SQLException e) {
			System.err.println("Error trying to introduce the DATA" + e);
			return false;
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to introduce the DATA" + e2);
			}
		}

	}

	@Override
	public boolean update(User user) {

		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "UPDATE user SET name=?, user=?, password=? WHERE id=? ";

		try {

			ps = con.prepareStatement(sql);
			ps.setString(1, user.getFullName());
			ps.setString(2, user.getUser());
			ps.setString(3, user.getPassword());
			ps.setInt(4, user.getId());
			ps.execute();

			return true;
		} catch (SQLException e) {
			System.err.println("Error trying to update the DATA" + e);
			return false;
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to update the DATA" + e2);
			}
		}
	}

	@Override
	public boolean read(User user) {

		PreparedStatement ps = null;
		Connection con = getConexion();
		ResultSet rs = null;

		String sql = "SELECT * FROM user WHERE id=? ";

		try {

			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			rs = ps.executeQuery();

			if (rs.next()) {

				user.setId(Integer.parseInt(rs.getString("id")));
				user.setUser(rs.getString("user"));
				user.setFullName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return true;
			}

			return false;

		} catch (SQLException e) {
			System.err.println("Error trying to read the DATA" + e);
			return false;
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to read the DATA" + e2);
			}
		}

	}

	@Override
	public boolean delete(User user) {

		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "DELETE FROM user WHERE id=? ";

		try {

			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.execute();

			return true;
		} catch (SQLException e) {
			System.err.println("Error trying to delete the DATA" + e);
			return false;
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to delete the DATA" + e2);
			}
		}

	}

}
