package coffees;

//Implementación de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente será decorado.

public class DarkRoast implements IBeverage {
	
	public DarkRoast() {
	        
	}


	@Override
	public double cost() {
		return 2;
	}

	@Override
	public String createBeverage() {
		return "Dark Roast Coffee -> $2";
	}

}
