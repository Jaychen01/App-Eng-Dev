package Assignment5.PartC;

public class TestPet {

	public static void main(String[] args) {
		
		Pet pet = new Pet("Spot","Mary","Black and White");
		System.out.println(pet.toString());
		
		Pet cat = new Cat("Tom","Bob","Black","Short");
		cat.setSex(2);
		System.out.println(cat.toString());		
		
		Pet dog = new Dog("Cookie","Susan","White","Large");
		dog.setSex(2);
		System.out.println(dog.toString());
		
		Boardable dog2 = new Dog("Cookie","Susan","White","Large");
		dog2.setBoardStart(12, 2, 2020);
		dog2.setBoardEnd(12, 5, 2020);
		System.out.println(dog2.boarding(1, 25, 2020));
		
		Boardable cat2 = new Cat("Cookie","Susan","White","Long");
		cat2.setBoardStart(12, 2, 2020);
		cat2.setBoardEnd(12, 5, 2021);
		System.out.println(cat2.boarding(1, 25, 2021));
	}

}
