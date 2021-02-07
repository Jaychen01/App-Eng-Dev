package week2;

public class AddDigital
{
	public static void main(String[] args)
	{
		int input;
		input = 237;	
		System.out.println("Input = " + input);
		int sum1, sum2;;		  
		while (input > 9) 
		{
			sum1 = input / 10;
		    sum2 = input % 10;
		    input = sum1 + sum2;
		}
		int result = input; 
		System.out.println("Output = " + result);	    
	}	
}
	