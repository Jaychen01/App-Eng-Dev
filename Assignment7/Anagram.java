package Assignment7;


public class Anagram {

	public static void main(String[] args)
	{
		Anagram ana = new Anagram();
		System.out.println(ana.isAnagram("rat", "car"));	
	}
	
	public boolean isAnagram(String s, String t)
	{
		for (int i = 0; i < t.length();) 
		{		
			if (s.indexOf(t.charAt(i)) == -1 ) {	
				return false;
			}else
				i++;	
		}return true;
	}
}
