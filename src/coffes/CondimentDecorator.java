package coffes;

public abstract class CondimentDecorator implements Beverage {
	
	protected Beverage coffe;
	
	public CondimentDecorator(Beverage coffeD) {
		coffe = coffeD;
	}
	

	public String getDescription() {
		return coffe.getDescription();
		
	}
	
	public double cost() {
		return coffe.cost();
	}
	
}

