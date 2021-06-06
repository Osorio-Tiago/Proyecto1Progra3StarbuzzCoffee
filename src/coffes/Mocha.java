package coffes;

//Clase que representa uno de los ingredientes adicionales que se le pueden
//agregar a la bebida. Es uno de los decoradores concretos que heredan de
//BeverageDecorator.

public class Mocha extends CondimentDecorator {

	public Mocha(IBeverage coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + "Mocha "; 
	}
	
	//Este método le suma al precio base de la bebida el costo del ingrediente adicional.

	public double cost() {
		return 1.50 + coffee.cost();
	}
}
