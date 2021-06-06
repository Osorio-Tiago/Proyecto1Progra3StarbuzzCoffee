package coffees;

//Clase que representa uno de los ingredientes adicionales que se le pueden
//agregar a la bebida. Es uno de los decoradores concretos que heredan de
//BeverageDecorator.

public class WhippedMilk extends BeverageDecorator{
	
	 public  WhippedMilk(IBeverage beverage) {
	        super(beverage);
	 }
	 
	 //No tiene costo adicional
	 public double cost(){
	        return super.cost() + 0.0;
	 }
	    
	 public String createBeverage(){
	        return super.createBeverage() + "\nWhipped Milk: No additional cost-";
	 }
}
