package Assignment3;

public class Numbers {

	private static Numbers num;


	public String countAndSay(int n) {
		if (n == 1) return "1";
		if (n == 2) return "11";
	
		String str = "11";
		for (int i = 3; i <= n; i++) 
		{
		str += "@";
		int count = 1;
		String temp = "";
		char[] array = str.toCharArray();
		for (int j = 0; j < str.length()-1; j++) 
		{
			if (array[j+1] != array[j]) 
			{
					
				temp += count;
				temp += array[j];
				count = 1;
			}
			else count++;	
		}
				
		str = temp;
		}
		return str;
	}
		
	
	public static void main(String[] args) {
		
		int n = 4;
		Numbers.num = new Numbers();		
		System.out.println(num.countAndSay(n));				
	}

}
