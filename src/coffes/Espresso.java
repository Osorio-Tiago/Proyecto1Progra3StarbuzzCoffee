package coffes;

//Implementaci�n de la interface Beverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente ser� decorado.

public class Espresso implements Beverage {
	  
	
	   public Espresso() {
	        
	    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Espresso Coffe: ";
	}
  
	public double cost() {
		return 2.5;
	}


}
