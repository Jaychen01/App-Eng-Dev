package Assignment6;

public class MyIndexOutOfBoundException extends IndexOutOfBoundsException {		
	
	private static final long serialVersionUID = 1L;
	private int lowerBound;
	private int upperBound;
	private int index;
			
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
			
		super("Error Message: Index: " + index + ", but Lower bound: " + lowerBound + 
				", Upper bound: " + upperBound);
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}

	
	public static void check(int score) throws MyIndexOutOfBoundException{
		if (score < 0 || score > 9) {
			MyIndexOutOfBoundException e = new MyIndexOutOfBoundException(0,9,score);
			throw e;
		}else {
			System.out.println("Score:" + score);
		}		
	}
	
	
	public static void main(String[] args) {	
		int score = 10;
		try {
			check(score);
		}catch(MyIndexOutOfBoundException e) {
			e.printStackTrace();
		}			
	}
	
}


