package decorator;

//Clase abstracta que especifica la estructura elemental de un decorador,
//la cual a su vez hereda de IBeverage y contiene un atributo de dicha interface 
//que podrá ser decorado.

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
