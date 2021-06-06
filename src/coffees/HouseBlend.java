package coffees;

//Implementación de la interface IBeverage. Confroma parte de las cuatro
//bebidas base y adicionalmente define un objeto que posteriormente será decorado.

public class HouseBlend implements IBeverage{
	
	public HouseBlend() {
		
	}

	@Override
	public double cost() {
		return 2.5;
	}

	@Override
	public String createBeverage() {
		return "House Blend Coffee -> $2.5";
	}

}
