package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultasDAOImp extends Database implements ConsultasDAO {

	List<Request> listRequest = new ArrayList<>();
	List<Order> listOrders = new ArrayList<>();

	@Override
	public ArrayList<Order> readPendientes(int num) {
	

		Order order = new Order();

		PreparedStatement ps = null;
		Connection con = getConexion();
		ResultSet rs = null;

		String sql = "SELECT * FROM orden WHERE idPedido=? ";

		try {

			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();


			while(rs.next()){
				
				
				order.setDetail(rs.getString("detalle"));
				order.setCost(rs.getDouble("costo"));
				order.setStatus(rs.getString("estado"));
				
				listOrders.add(new Order(order.getDetail(), order.getCost(), order.getStatus()));
				
			}

		} catch (SQLException e) {
			System.err.println("Error trying to read the DATA" + e);
			
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to read the DATA" + e2);
			}
		}


		
		return (ArrayList<Order>) listOrders;
		
	}
	


	@Override
	public boolean readProcesadas(Request request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumberPendiantes() {
		PreparedStatement ps = null;
		Connection con = getConexion();
		ResultSet rs = null;

		String sql = "SELECT COUNT(*) FROM orden WHERE estado = 'Pendiente'";

		int count = 0;

		try {

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			if (rs.next()) {

				count = rs.getInt("COUNT(*)");

				return count;
			}

		} catch (SQLException e) {
			System.err.println("Error trying to read the DATA" + e);

		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to read the DATA" + e2);
			}
		}
		return count;
	}



	@Override
	public ArrayList<Request> getRequest(Request request) {
		PreparedStatement ps = null;
		Connection con = getConexion();
		ResultSet rs = null;

		String sql = "SELECT idPedido from pedido where  estadoPedido = 'Pendiente'";
		
		try {

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()){
				request.setIdRequest((rs.getInt("idPedido")));
				//System.out.println(request.getIdRequest());
				listRequest.add(new Request(request.getIdRequest(), request.getTotalDetail(), request.getTotalStatus(), request.getTotalCost()));
				//listOrders.add(new Order(modelOrder.getDetail(), modelOrder.getCost(), modelOrder.getStatus()));
			}
			

			
			
		} catch (SQLException e) {
			System.err.println("Error trying to read the DATA" + e);
		
		} finally { // Este proceso es para finalizar la conexion
			try {
				con.close();
			} catch (SQLException e2) {
				System.err.println("Error trying to read the DATA" + e2);
			}
		}
		return (ArrayList<Request>) listRequest;

		

	}



	@Override
	public boolean setEstadoPendientes(Request request) {
		PreparedStatement ps = null;
		Connection con = getConexion();
		String sql = "UPDATE pedido SET estadoPedido=?  WHERE idPedido=? ";

		
		try {

			ps = con.prepareStatement(sql);
			ps.setString(1, request.getTotalStatus());
			ps.setInt(2, request.getIdRequest() );
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












}
