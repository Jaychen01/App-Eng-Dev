package Assignment4.Q3;

public class DessertShop {

	protected double taxRate = 0.065;
	protected String nameOfStore = " M & M Dessert Shop ";

	public static String cents2DollarsAndCents(int costPlusTax){
		
		if (costPlusTax < 0) {
			return "Error";
		}
		else {
			return (costPlusTax/100.00)+"";	
		}
	}
	
}
