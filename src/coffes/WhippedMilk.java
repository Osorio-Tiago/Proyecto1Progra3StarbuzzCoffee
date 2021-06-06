package coffes;

public class WhippedMilk extends CondimentDecorator {

	public WhippedMilk(Beverage coffe) {
		super(coffe);
	}

	public String getDescription() {
		return super.getDescription() + " WhippedMilk "; 
	}

	public double cost() {
		return 1 + coffe.cost();
	}
}
