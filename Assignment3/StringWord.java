package Assignment3;

public class StringWord {

	public String reverse(String s)
	{
		StringBuffer strBuffer = new StringBuffer();
		char[] c = s.toCharArray();
		reverse(c, 0, s.length()-1);
		String str = new String(c);
		String[] strArray = str.split(" ");
		int size = strArray.length;
		for(int i = 0; i < size; i++)
		{
			c = strArray[i].toCharArray();
			reverse(c, 0, strArray[i].length()-1);
			strBuffer.append(new String(c)).append(" ");
		}
		return strBuffer.toString();
	}
	public void reverse(char[] c,int start,int end)
	{
		while(start < end)
		{
			char temp = c[end];
			c[end--] = c[start];
			c[start++] = temp;
		}
	}
	
	public static void main(String[] args) {
		StringWord str = new StringWord();
		System.out.println(str.reverse("the sky is blue A"));
	}

}
