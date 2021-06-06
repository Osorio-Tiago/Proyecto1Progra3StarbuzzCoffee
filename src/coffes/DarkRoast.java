package coffes;

public class DarkRoast implements Beverage {
	
    public DarkRoast() {
        
    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Dark Roast Coffee: ";
	}
	
	public double cost() {
		return 1;
	}
	   public String toString() 
	    {
	        return "Descripton: "+getDescription()+" - Cost:"+cost();
	      }

}
