package decorator;

//Implementación de la interface IBeverage. Esta clase define el objeto
//que posteriormente será decorado.

public abstract class BeverageDecorator implements IBeverage {
	 protected IBeverage beverage;
	   
	   public BeverageDecorator(IBeverage beverage){
	       this.beverage = beverage;
	   }
	   
	   @Override 
	   public double cost(){
	       return beverage.cost();
	   }

	   
	   @Override
	   public String createBeverage(){
	       return beverage.createBeverage();
	   }
	   
	  
}
