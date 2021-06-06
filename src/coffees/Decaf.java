package decorator;

//Implementaci�n de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente ser� decorado.


public class Decaf implements IBeverage {
	
	public Decaf() {
		
	}

	@Override
	public double cost() {
		return 1.90;
	}

	@Override
	public String createBeverage() {
		return "Decaf Coffee -> $1.90";
	}

}
