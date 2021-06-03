package Decorator;

public class SteamedMilk extends BeverageDecorator {
	
	 public SteamedMilk(IBeverage beverage) {
	        super(beverage);
	 }
	 
	 //Le suma al precio base de la bebida el costo del ingrediente adicional.
	 public double cost(){
	        return super.cost() + 1.0;
	 }
	    
	 public String createBeverage(){
	        return super.createBeverage() + "\nAdditional Ingredient: Steamed Milk -> $1";
	 }

}
