package coffes;

public class HouseBlend implements Beverage {
	
	   public HouseBlend() {
	        
	    }
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "HouseBlend Coffe : ";
	}
	public double cost() {
		return 1;
	}

    public String toString() 
    {
        return "Descripton: "+getDescription()+" - Cost:"+cost();
      }

}
