package coffes;

//Implementación de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente será decorado.

public class HouseBlend implements IBeverage {
	
	   public HouseBlend() {
	        
	    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "HouseBlend Coffee : ";
	}
	public double cost() {
		return 3;
	}

    public String toString() 
    {
        return "Descripton: "+getDescription()+"\n - Cost:"+cost();
      }

}
