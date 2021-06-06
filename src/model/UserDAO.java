package model;


// Se crea una interfaz DAO, la cual se define como una capa básica del modelo
// que permite mantener el dominio desacoplado de la capa de persistencia. Esta
//abarca  el comportamiento necesario para tratar los objetos en la base de datos.

//Esta interface permite crear,actualizar, eliminar y leer los datos de un pedido. 

public interface UserDAO {

 public boolean create(User user);  
 public boolean read(User user);
 public boolean update(User user);
 public boolean delete(User user); 
	
}
