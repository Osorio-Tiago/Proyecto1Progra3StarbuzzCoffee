package coffes;

public class Soy extends CondimentDecorator {

	public Soy(Beverage coffe) {
		super(coffe);
	}

	public String getDescription() {
		return super.getDescription() + " Soy "; 
	}

	public double cost() {
		return 1 + coffe.cost();
	}
}
