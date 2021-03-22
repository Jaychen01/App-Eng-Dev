package Assignment7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValueOccurrences {
	
	public static void main(String[] args)
	{
		ValueOccurrences occ = new ValueOccurrences();
		int[] arr = {1,2,2,1,1,3};
		System.out.println(occ.uniqueOccurrences(arr));
	}

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int number : arr) {
			map.put(number, map.getOrDefault(number,0)+1);
		}
		Set<Integer> set = new HashSet<>();
		for (int occurrence : map.values()) {
			if(set.contains(occurrence)) {
				return false;
			}
			set.add(occurrence);
		}
		return true;
	}	
}
