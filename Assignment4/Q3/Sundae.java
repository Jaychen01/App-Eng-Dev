package Assignment4.Q3;

public class Sundae extends IceCream {
	
	private String nameOfTopping;
	private int priceOfTopping;
	
	public Sundae(String name, int unitPrice, String nameOfTopping, int priceOfTopping) {
		super(name,unitPrice);
		this.nameOfTopping = nameOfTopping;
		this.priceOfTopping = priceOfTopping;	
	}
	
	@Override
	public int getCost() {
		return unitPrice+priceOfTopping ;
	}	

}
