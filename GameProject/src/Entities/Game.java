package Entities;

public class Game {
	int id;
	String gameName;
	double unitPrice;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getGameName() {
		return gameName;
	}



	public void setGameName(String gameName) {
		this.gameName = gameName;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}



	public Game(int id, String gameName, double unitPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}
	
	

}
