package coffes;

//Clase que representa uno de los ingredientes adicionales que se le pueden
//agregar a la bebida. Es uno de los decoradores concretos que heredan de
//BeverageDecorator.
public class WhippedMilk extends CondimentDecorator {

	public WhippedMilk(IBeverage coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + " WhippedMilk "; 
	}
	
	//Este método le suma al precio base de la bebida el costo del ingrediente adicional.
	public double cost() {
		return 0 + coffee.cost();
	}
}
