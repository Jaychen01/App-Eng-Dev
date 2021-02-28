package Assignment5.PartC;

import java.time.LocalDate;

public class Cat extends Pet implements Boardable{

	private String hairLength;
	private LocalDate start, end, test;
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength(){
		return hairLength;
	}
	
	public String toString() {
		String str = "CAT:\n";
		str += super.toString()+"\n";
		str += "Hair: " + getHairLength() +"\n";
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
