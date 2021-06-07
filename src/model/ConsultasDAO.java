package model;

import java.util.ArrayList;

public interface ConsultasDAO {

	public ArrayList<Order> readPendientes(int num);
	
	public ArrayList<Request> getRequest(Request request);
	
	public boolean readProcesadas(Request request);

	public int getNumberPendiantes();

	boolean setEstadoPendientes(Request request);
	
	
}
