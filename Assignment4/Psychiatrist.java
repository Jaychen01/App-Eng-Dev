package Assignment4.Q2;

public class Psychiatrist {

	public void examine(Moody moody) {
		
		System.out.println("How are you feeling today?");
		System.out.println(moody.getMood());
		
	}
	
	public void observe(Moody moody) {
		
		System.out.println(moody.toString());
		
	}	

	
	public static void main(String[] args) {
		
		Psychiatrist psy = new Psychiatrist();
		Moody moody1 = new Happy();
		psy.examine(moody1);
		moody1.expressFeelings();
		psy.observe(moody1);
		System.out.println("===============");
		Moody moody2 = new Sad();
		psy.examine(moody2);
		moody2.expressFeelings();
		psy.observe(moody2);

	}

}
