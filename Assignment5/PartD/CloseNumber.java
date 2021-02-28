package Assignment5.PartD;

import java.util.ArrayList;

public class CloseNumber {
	
	public ArrayList<Integer> findClosestNumber(int[] array, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		
		if (array == null || array.length == 0){
			list.add(-1);
			return list;
		}
		
		int left = 0 ,right = array.length - 1;
		while(left < right -1 ) {
			int mid = left + (right - left)/2;
			if (array[mid] < target) {
				left = mid;
			}else
				right = mid;
		}
		
		int closeNum;
		int l = target - array[left];
		int r = array[right] -target;
		
		if( l == r) {
			for(int i = 0; i < array.length; i++ ) 
			{
				if (array[i] == array[left] || array[i] == array[right]) {
				list.add(i);
				}
			}
		}
		
		else{		
			if(l < 0) {
				closeNum = array[left];
		}
			if(r < 0) {
				closeNum = array[right];
		}
			else 
				closeNum = l < r ? array[left] : array[right];
		
			for(int i = 0; i < array.length; i++ ) 
			{
				if (array[i] == closeNum) {
					list.add(i);
				}
			}
		}
		return list;			
	}		

	public static void main(String[] args){
		
		int[] array = {1,1,3,4};
		int target = 2;		
		CloseNumber cn = new CloseNumber();				
		System.out.println(cn.findClosestNumber(array,target));
	}
	
}
