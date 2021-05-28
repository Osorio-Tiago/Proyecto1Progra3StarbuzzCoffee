package model;


// Tambien se conoce como CRUD 
public interface UserDAO {

 public boolean create(User user);  
 public boolean read(User user);
 public boolean update(User user);
 public boolean delete(User user); 
	
}
