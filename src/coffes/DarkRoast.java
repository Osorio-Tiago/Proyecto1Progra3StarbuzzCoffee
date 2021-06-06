package coffes;

//Implementación de la interface Beverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente será decorado.

public class DarkRoast implements Beverage {
	
    public DarkRoast() {
        
    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Dark Roast Coffee: ";
	}
	
	public double cost() {
		return 2;
	}
	   public String toString() 
	    {
	        return "Descripton: "+getDescription()+" - Cost:"+cost();
	      }

}
