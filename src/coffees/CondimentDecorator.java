package coffees;

//Clase abstracta que especifica la estructura elemental de un decorador,
//la cual a su vez hereda de IBeverage y contiene un atributo de dicha interface 
//que podr� ser decorado.

public abstract class CondimentDecorator implements IBeverage {
	
	protected IBeverage coffee;
	
	public CondimentDecorator(IBeverage coffeeD) {
		coffee = coffeeD;
	}
	

	public String getDescription() {
		return coffee.getDescription();
		
	}
	
	public double cost() {
		return coffee.cost();
	}
	
}

