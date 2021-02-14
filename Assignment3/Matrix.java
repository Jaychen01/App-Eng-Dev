package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	


	public int[] spiralOrder(int[][] matrix) {
		 List<Integer> order = new ArrayList<>();
		 if (matrix == null || matrix.length == 0)
			 return null;
		 int left = 0;
		 int right = matrix[0].length - 1;
		 int top = 0;
		 int bottom = matrix.length - 1;
		 int numberOfElement = matrix[0].length * matrix.length;
		 while (numberOfElement > 0) {
			 for (int i = left; i <= right && numberOfElement > 0; i++) {
				 order.add(matrix[top][i]);
				 numberOfElement--;
			 }
			 top++;
			 
			 for (int i = top; i <= bottom && numberOfElement > 0; i++) {
				 order.add(matrix[i][right]);
				 numberOfElement--;
			 }
			 right--;
			 for (int i = right; i >= left && numberOfElement > 0; i--) {
				 order.add(matrix[bottom][i]);
				 numberOfElement--;
			 }
			 bottom--;
			 
			 for (int i = bottom; i >= top && numberOfElement > 0; i--) {
				 order.add(matrix[i][left]);
				 numberOfElement--;
			 }
			 left++;
		 }
		 int size = order.size();
		 int[] result = new int[size];
		 String[] array = (String[])order.toArray(new String[size]);
		 for(int i = 0; i < size; i++) {
			 result[i] = Integer.parseInt(array[i]);
		 }
		 return result;
	 }
	 
	 public static void main(String[] args) {

	 }
	        

}
