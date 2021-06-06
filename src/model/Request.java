package model;

public class Request {

	int idRequest;
	String totalDetail;
	String totalStatus;
	double totalCost;
	
	
	
	
	public Request(int idRequest, String totalDetail, String totalStatus, double totalCost) {
		super();
		this.idRequest = idRequest;
		this.totalDetail = totalDetail;
		this.totalStatus = totalStatus;
		this.totalCost = totalCost;
	}
	
	
	public Request() {
		
		
	}
	
	
	public int getIdRequest() {
		return idRequest;
	}
	public void setIdRequest(int idRequest) {
		this.idRequest = idRequest;
	}
	public String getTotalDetail() {
		return totalDetail;
	}
	public void setTotalDetail(String totalDetail) {
		this.totalDetail = totalDetail;
	}
	public String getTotalStatus() {
		return totalStatus;
	}
	public void setTotalStatus(String totalStatus) {
		this.totalStatus = totalStatus;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	
	
}
