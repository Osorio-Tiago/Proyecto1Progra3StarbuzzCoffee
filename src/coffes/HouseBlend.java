package coffes;

//Implementaci�n de la interface Beverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente ser� decorado.

public class HouseBlend implements Beverage {
	
	   public HouseBlend() {
	        
	    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "HouseBlend Coffe : ";
	}
	public double cost() {
		return 3;
	}

    public String toString() 
    {
        return "Descripton: "+getDescription()+"\n - Cost:"+cost();
      }

}
