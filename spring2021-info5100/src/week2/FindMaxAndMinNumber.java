package week2;

import java.util.Arrays;

public class FindMaxAndMinNumber
{

	public void findMaxAndMin(int[] array) {
		int max = array [0], min = array [0];
		for (int item : array)
		{
			if (item < min) {
				min = item;
			}
			else if (item > max) {
				max = item;
			}
		}	
		System.out.println("Output : Max is " + max + " and " + "Min is " + min);
	}	

	public static void main(String[] args){			
		
		int[] array  = new int[] {3, 5, 7, 1, 36, 32, 15};
		System.out.println("Input : " + Arrays.toString(array));
		FindMaxAndMinNumber maxmin = new FindMaxAndMinNumber();
		maxmin.findMaxAndMin(array);	
	}		
}
