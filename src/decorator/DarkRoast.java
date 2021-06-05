package decorator;

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
