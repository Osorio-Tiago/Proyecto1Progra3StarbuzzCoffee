package model;

public class Coffe {

	
	private String cafe;
	private String soya;
	private String mocha;
	private String steamed;
	private String whipped;
	
	
	
	
	public Coffe(String cafe, String soya, String mocha, String steamed, String whipped) {
		super();
		this.cafe = cafe;
		this.soya = soya;
		this.mocha = mocha;
		this.steamed = steamed;
		this.whipped = whipped;
	}
	
	public Coffe() {

	}
	
	public String getCafe() {
		return cafe;
	}
	public void setCafe(String cafe) {
		this.cafe = cafe;
	}
	public String getSoya() {
		return soya;
	}
	public void setSoya(String soya) {
		this.soya = soya;
	}
	public String getMocha() {
		return mocha;
	}
	public void setMocha(String mocha) {
		this.mocha = mocha;
	}
	public String getSteamed() {
		return steamed;
	}
	public void setSteamed(String steamed) {
		this.steamed = steamed;
	}
	public String getWhipped() {
		return whipped;
	}
	public void setWhipped(String whipped) {
		this.whipped = whipped;
	}
	
	
	
	
	
}
