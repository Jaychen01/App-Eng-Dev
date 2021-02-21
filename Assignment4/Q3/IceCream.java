package Assignment4.Q3;

public class IceCream extends DessertItem{
	
	protected int unitPrice;
	
	public IceCream(String name, int unitPrice) {
		this.name = name;
		this.unitPrice = unitPrice;						
	}
	
	@Override
	public int getCost() {
		return unitPrice;
	}	

}
