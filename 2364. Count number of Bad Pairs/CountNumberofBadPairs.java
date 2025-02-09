package solutions;

import java.util.HashMap;

public class CountNumberofBadPairs {
	
	public static void main(String[] args) {
		
		int[] nums = {4,1,3,3};
		System.out.println(countBadPairs(nums));
		
	}
	
	public static long countBadPairs(int[] nums) {
		int n = nums.length;
		
//		hashmap
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for ( int i = 0; i< n ; i++) {
			int key = nums[i]-i;
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		long goodPairs = 0;
		
		for ( int count : map.values()) {
			if ( count >= 2) {
				goodPairs += (long) count * (count - 1)/2;
			}
		}
		
		long totalPairs = (long) n * (n-1)/2;
		long badPairs = totalPairs - goodPairs;
		return badPairs;
	}

}
