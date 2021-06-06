package coffes;

public class SteamedMilk extends CondimentDecorator {

	public SteamedMilk(Beverage coffe) {
		super(coffe);
	}

	public String getDescription() {
		return super.getDescription() + " SteamedMilk "; 
	}

	public double cost() {
		return 1 + coffe.cost();
	}
}
