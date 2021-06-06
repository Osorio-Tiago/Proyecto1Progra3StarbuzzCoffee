package coffes;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage coffe) {
		super(coffe);
	}

	public String getDescription() {
		return super.getDescription() + "Mocha "; 
	}

	public double cost() {
		return 1 + coffe.cost();
	}
}
