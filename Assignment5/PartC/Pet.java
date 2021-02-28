package Assignment5.PartC;

public class Pet {
	
//	instance variables
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE=0, FEMALE=1, SPAYED=2, NEUTERED=3;
	
	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return name;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		sex = sexid;		
	}
	
	public String getSex() {
		
		switch(sex) {	
		case MALE:
			return "Male";				
		case FEMALE:
			return "Female";			
		case SPAYED:
			return "Spayed";			
		case NEUTERED:
			return "Neutered";			
		default:
			return "Value Error";			
		}		
	}
	 
	public String toString() {
		return getPetName() + " Owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex();
	}
	
}
