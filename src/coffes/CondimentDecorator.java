package coffes;

//Clase abstracta que especifica la estructura elemental de un decorador,
//la cual a su vez hereda de IBeverage y contiene un atributo de dicha interface 
//que podrá ser decorado.

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

