package model;

//Se crea una interface DAO, la cual  permite mantener el dominio 
//desacoplado de la capa de persistencia.Esta interface permite crear,
//actualizar y leer los datos de una orden. 

public interface OrderDAO {

	 public boolean create(Order order, Request request);
	 public boolean update(Order order);
	 public boolean read(Order order);
}

