package model;

//La clase User es un contenedor elemental que define los datos m�s 
//relevantes del usuario.


public class User {
    
    private int id;
    private String fullName;
    private String user;
    private String password;
    
    
    //M�todos get() y set()
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
   
    

    
}
