package week2;

class CharInString
{
	public static void main(String[] args)
	{
		String string = "North";
		char c = 'o';
		System.out.println(" Input : " + string +',' + c);
		System.out.println(" Output : " + characterCountInString(string, c));
	}		
	
	public static int characterCountInString(String s, char c)
	{
		int count = 0;
				
		for (int i=0; i < s.length(); i++) 
		{
			if (s.charAt(i) == c) 
				count++;
		}	
		return count;
	}

}