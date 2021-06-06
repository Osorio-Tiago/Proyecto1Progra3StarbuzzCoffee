package coffees;

//Implementaci�n de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente ser� decorado.

public class Espresso  implements IBeverage{
	
	public Espresso() {
		
	}

	@Override
	public double cost() {
		return 3;
	}

	@Override
	public String createBeverage() {
		return "Espresso Coffee -> $3";
	}

}
