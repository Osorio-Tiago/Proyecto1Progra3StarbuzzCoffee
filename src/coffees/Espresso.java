package coffees;

//Implementaci�n de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente ser� decorado.

public class Espresso implements IBeverage {
	  
	
	   public Espresso() {
	        
	    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Espresso Coffee: ";
	}
  
	public double cost() {
		return 2.5;
	}


}
