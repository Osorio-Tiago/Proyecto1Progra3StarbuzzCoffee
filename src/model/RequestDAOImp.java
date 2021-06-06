package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//La clase RequestDaoImp implementa los métodos de RequestDAO, con el objetivo principal
//de crear, actualizar, eliminar o leer información de la base de datos.
public class RequestDAOImp extends Database implements RequestDAO{

	@Override
	public boolean create(Request request) {

		PreparedStatement ps = null;
		Connection con = getConexion(); //Establece una conexión.
		String sql = "INSERT INTO pedido (detallePedido, estadoPedido ,costoPedido) values(?,?,?)";


		try {
			ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, request.getTotalDetail());
			ps.setString(2, request.getTotalStatus());
			ps.setDouble(3, request.getTotalCost());

			ps.execute();	
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if(rs.next()) {

			request.setIdRequest(rs.getInt(1));	
			
			return true;
				
			}
			
			return false;
	
		} catch (SQLException e) {
			System.err.println("Error trying to introduce the DATA" + e);
			return false;
		
			} finally { // Este proceso es para finalizar la conexión
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error" + e2);
			}
		}
		
		
		
		
		
	}

	@Override
	public boolean update(Request request) {


		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "UPDATE pedido SET detallePedido=?, estadoPedido=?, costoPedido=? WHERE idPedido=? ";

		try {

			ps = con.prepareStatement(sql);
			ps.setString(1, request.getTotalDetail());
			ps.setString(2, request.getTotalStatus());
			ps.setDouble(3, request.getTotalCost());
			ps.setInt(4, request.getIdRequest());
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
	public boolean read(Request request) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
