package decorator;

//Bebida base

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
