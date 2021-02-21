package Assignment4.Q2;

public class Happy extends Moody {
	
	@Override
	protected String getMood() {
		
		return "I feel happy today!";	
		
	}
	
	@Override
	public void expressFeelings() {
		
		System.out.println("hehehe...hahahaha...HAHAHAHAHA!!!");
		
	}
	
	
	public String toString() {
		
		return "Subject laughs a lot";
		
	}

}
