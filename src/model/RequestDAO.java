package model;

//Se crea una interface DAO, la cual se define como una capa básica del modelo
//que permite mantener el dominio desacoplado de la capa de persistencia.
//Esta interface permite crear,actualizar y leer los datos de un pedido. 

public interface RequestDAO {

		 public boolean create(Request request);
		 public boolean update(Request request);
		 public boolean read(Request request);

}
