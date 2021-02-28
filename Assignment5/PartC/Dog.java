package Assignment5.PartC;

import java.time.LocalDate;

public class Dog extends Pet implements Boardable{
	
	private String size;
	private LocalDate start, end, test;
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize(){
		return size;
	}
	
	public String toString() {
		String str = "DOG:\n";
		str += super.toString()+"\n";
		str += "Size: " + getSize() +"\n";
		return str;
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		
		if (year > 1000 && year < 10000) {
	    start = LocalDate.of(year,month,day);
		}else
			System.out.println("please re-enter start year with four digital number");
	}
	
	@Override
	public void setBoardEnd(int month, int day, int year) {
		if (year > 1000 && year < 10000) {
        end = LocalDate.of(year,month,day);
		}else
			System.out.println("please re-enter end year with four digital number");
	} 
	
	@Override
	public boolean boarding(int month, int day, int year) {

		if (year > 1000 && year < 10000) {
			test = LocalDate.of(year,month,day);
		}else
			System.out.println("please re-enter test year with four digital number");
		
		if (test.compareTo(start) >= 0 && test.compareTo(end) <= 0) {
		    return true;
		}
		return false;	
	}

}
