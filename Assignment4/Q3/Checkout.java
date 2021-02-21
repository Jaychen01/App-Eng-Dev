package Assignment4.Q3;

import java.util.ArrayList;

public class Checkout {
	
	int totalItem;
	int totalCost;
	int totalTax;
	
	ArrayList<DessertItem> list = new ArrayList<>();
	
	public void enterItem(DessertItem item) {
	
		list.add(item);
				
	}
	
	public int numberOfItems() {
		totalItem = list.size();
		return totalItem; 
	}
	
	public int totalCost() {
		totalCost = 0;
		for(int i=0; i<list.size();i++) {
			totalCost += list.get(i).getCost();
		}
		return totalCost;
	}
	
	public int totalTax() {
		totalTax = 0;
		totalTax = (int) Math.round(totalCost*new DessertShop().taxRate);
		return totalTax = (int) Math.round(totalCost*new DessertShop().taxRate);
	}
	
	public String toString() {
		
		String str = new String();
		str = "    " + new DessertShop().nameOfStore +"\n";
		str += "    --------------------\n";
				
		for(int i=0; i<list.size(); i++) {
			DessertItem item = list.get(i);
			if(item instanceof Candy) {
				
				Candy candy = (Candy) item;
				str += "\n"+candy.getWeight()+"lbs. @ "+candy.getpriceOfPound()/100.00 + "/lb.\n";
				
			} 
			else if(item instanceof Cookie) {
				
				Cookie cookie = (Cookie)item; 
				str += "\n"+cookie.getnumber()+" @ "+cookie.getpriceOfDozen()/100.00 + "/dz.\n";
			
			}
				if (item.getName().length() <= 15) {
					str += "\n"+item.getName()+"\t\t"+DessertShop.cents2DollarsAndCents(item.getCost()) + "\n";
				}else {
					str += "\n"+item.getName()+"\t"+DessertShop.cents2DollarsAndCents(item.getCost()) + "\n";	
				}
		}
		
		str += "\nTax \t\t\t" + totalTax()/100.00 + "\n";
		str += "\nTotal cost \t\t" + (totalCost()+totalTax())/100.00 + "\n";
		return str;
	}
	
	public void print() {
		System.out.println(toString());
		
	}

	
	public void clear() {
		
		list.clear();
		System.out.println("\n\n");
	}


}
