package decorator;

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
