package Decorator;

public class Soy extends BeverageDecorator {
	
	 public Soy(IBeverage beverage) {
	        super(beverage);
	 }
	 
	 //Le suma al precio base de la bebida el costo del ingrediente adicional.
	 public double cost(){
	        return super.cost() + 1.20;
	 }
	    
	 public String createBeverage(){
	        return super.createBeverage() + "\nAdditional Ingredient: Soy -> $1.20";
	 }

}
