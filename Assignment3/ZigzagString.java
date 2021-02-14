package Assignment3;

public class ZigzagString {
	  
	public String convert(String s, int numRows) {
	        if (numRows <= 1 || s.length() < numRows || s == null) {
	            return s;
	        }
	        StringBuilder strBuilder = new StringBuilder(s.length());
	        int a,b;
	        for(int i = 0; i < numRows; i++) {
	        	a = 0;
	        	b = i;
	        	while(true) {
	        		if(b < s.length()) {
	        			strBuilder.append(s.charAt(b));
	        		}else break;
	        		if ((a ^= 1) == 1) {
	        			b = b + 2*((numRows - i - 1) == 0 ? i : numRows - i - 1);
	        		}else {
	        			b = b + 2*(i == 0 ? numRows - i - 1 : i);
	        		}
	        	}
	        }
	        return strBuilder.toString();

	}

	public static void main(String[] args) {
		
		 ZigzagString st = new ZigzagString();	
		 String str = "PAYPALISHIRING";		
		 int n = 3;	 
		 System.out.println(st.convert(str, n));

	}

}
