package coffees;

//Clase que representa uno de los ingredientes adicionales que se le pueden
//agregar a la bebida. Es uno de los decoradores concretos que heredan de
//BeverageDecorator.

public class Mocha extends BeverageDecorator{
	
	 public Mocha(IBeverage beverage) {
	        super(beverage);
	 }
	 
	 //Le suma al precio base de la bebida el costo del ingrediente adicional.
	 public double cost(){
	        return super.cost() + 1.50;
	 }
	    
	 public String createBeverage(){
	        return super.createBeverage() + "\nAdditional Ingredient: Mocha -> $1.50";
	 }
	    
	

}
