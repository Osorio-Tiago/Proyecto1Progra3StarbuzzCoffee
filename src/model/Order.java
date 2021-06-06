package model;

//La clase Request es un contenedor elemental que define los datos o informaci�n
//m�s relevante de una orden.


public class Order {

	int id;
	String detail;
	String status;
	double cost;
	
	
	//Constructor con par�metros.
	public Order(String detail, double cost, String status) {
		super();
		this.detail = detail;
		this.cost = cost;
		this.status = status;
	}
	
	//Constructor sin par�metros.

	public Order() {
	
	}
	
	
	//M�todos get() y set()
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    public String toString() 
    {
        return "Descripton: "+getDetail()+" - Cost:"+getCost();
      }
	
	
}
