package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class OrderDAOImp extends Database implements OrderDAO{

	
	
	@Override
	public boolean create(Order order, Request request) {
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "INSERT INTO orden (idPedido,detalle,estado,costo) values(?,?,?,?)";


		try {
			ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1, request.getIdRequest());
			ps.setString(2, order.getDetail());
			ps.setString(3, order.getStatus());
			ps.setDouble(4, order.getCost());

			ps.execute();	
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if(rs.next()) {

			order.setId(rs.getInt(1));	
				
			return true;
				
			}
			
			return false;
	
		} catch (SQLException e) {
			System.err.println("Error trying to introduce the DATA" + e);
			return false;
		
			} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error" + e2);
			}
		}
		
		
		

	}

	@Override
	public boolean update(Order order) {


		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "UPDATE orden SET detalle=?, estado=?, costo=? WHERE idOrden=? ";

		try {

			ps = con.prepareStatement(sql);
			ps.setString(1, order.getDetail());
			ps.setString(2, order.getStatus());
			ps.setDouble(3, order.getCost());
			ps.setInt(4, order.getId());
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
	public boolean read(Order order) {
		return false;
		
		
		
		
		
	}



}
