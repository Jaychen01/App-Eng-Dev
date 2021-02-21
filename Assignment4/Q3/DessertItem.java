package Assignment4.Q3;

public abstract class DessertItem {
	
	protected String name;
	
	public DessertItem(String name) {
		this.name = name;
	}
	
	public DessertItem() {
		
	}
	
	public final String getName() {
		return name;
	}
	
	public abstract int getCost();	

}
