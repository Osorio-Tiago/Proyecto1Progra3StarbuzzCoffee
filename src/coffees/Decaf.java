package coffees;

//Implementaci�n de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente ser� decorado.

public class Decaf implements IBeverage {

    public Decaf() {
        
    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Decaf Coffee: ";
	}
	
	public double cost() {
		return 1.80;
	}


}
