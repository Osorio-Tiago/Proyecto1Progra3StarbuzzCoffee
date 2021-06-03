package Decorator;

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
