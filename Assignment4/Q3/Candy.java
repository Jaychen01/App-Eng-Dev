package Assignment4.Q3;

public class Candy extends DessertItem{
	
	private double weight;
	private int priceOfPound;
	
	public Candy(String name, double weight,int priceOfPound) {
		this.name = name;
		this.weight = weight;
		this.priceOfPound = priceOfPound;				
	}
	
	@Override
	public int getCost() {
		return (int) Math.round(weight * priceOfPound);
	}	
	
	public double getWeight() {
		return weight;
	}	
	
	public int getpriceOfPound() {
		return priceOfPound;
	}	

}
