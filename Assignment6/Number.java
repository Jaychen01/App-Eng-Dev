package Assignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

	public static void count() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input two integers:");
		try {
			int i = scanner.nextInt();
			int j = scanner.nextInt();					
			if (j == 0) {
				throw new ArithmeticException();
						
		}
			System.out.println(i/(double)j);
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("Exception: Input is not an Integer");
			
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Exception: Integer can not be Divided by zero");			
		}
	}
	
	
	public static void main(String[] args) {	
		count();
		System.out.println("Done");
	}
}
