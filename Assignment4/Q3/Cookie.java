package Assignment4.Q3;

public class Cookie extends DessertItem {
	
	private int number;
	private int priceOfDozen;
	
	public Cookie(String name, int number, int priceOfDozen) {
		this.name = name;
		this.number = number;
		this.priceOfDozen = priceOfDozen;				
	}
	
	@Override
	public int getCost() {
		return Math.round(number * priceOfDozen / 12);
	}	
	
	public int getnumber() {
		return number;
	}	
	
	public int getpriceOfDozen() {
		return priceOfDozen;
	}	

}
