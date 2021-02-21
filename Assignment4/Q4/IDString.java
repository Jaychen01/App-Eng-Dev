package Assignment4.Q4;

public class IDString {
	
	public int[] idString(String S) {
		int N = S.length(),t = 0;
		if(N < 1 || N >10000) {
			return null;
		}else {
		int [] array = new int[N+1];
		for(int i = 0; i < N; i++) {
			if (S.charAt(i) == 'I') {
				array[i] = t++;
			}
		}
			array[N] = t++;
			
			for(int i = N-1; i > 0; i--) {
				if (S.charAt(i) == 'D') {
					array[i] = t++;
				} 
			}
			return array;		
		}
	}

	public static void main(String[] args) {
		
		String S = "IDID";
		IDString str = new IDString();
		int[] arr = str.idString(S);
	
		System.out.print("Input:" + S+"\n");
		System.out.print("Output:" + "[");
		for (int i = 0; i <= S.length(); i++) {
			if(i==0) {
				System.out.print(arr[i]);
			}else
			System.out.print("," + arr[i]);
			
		}
		System.out.println("]");
	}

}
