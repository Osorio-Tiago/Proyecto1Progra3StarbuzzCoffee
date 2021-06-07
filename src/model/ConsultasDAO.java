package model;

import java.util.ArrayList;

//Esta clase permite obtener la lista de pedidos pendientes y listos que se encuentran en la base de datos.
public interface ConsultasDAO {

	public ArrayList<Order> readPendientes(int num);
	
	public ArrayList<Request> getRequest(Request request);
	
	public boolean readProcesadas(Request request);

	public int getNumberPendiantes();

	boolean setEstadoPendientes(Request request);
	
	//METODOS NUEVOS
	public ArrayList<Request> getRequestFinished(Request request);
	public ArrayList<Order> readFinished(int num);
}
