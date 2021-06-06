package coffees;

//Interface  que define la estructura elemental del componente o aquellas clases
//que pueden ser decoradas. En este caso se declar� una interface IBeverage en la
//que se definen los m�todos cost(), para calcular el precio de las bebidas y 
//createBeverage() para agregar ingredientes posteriormente.

public interface IBeverage {
	
	public double cost();
	public String createBeverage();
	
}
