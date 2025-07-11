package solutions;

import java.util.Arrays;

public class MagneticForceByTwoBalls {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7};
		int m = 3;
		System.out.println(maxDistance(arr, m));
		
	}
	
	public static int maxDistance ( int[] arr, int m) {
		
		Arrays.sort(arr);
		int low = 1;
		int n = arr.length;
		int high = arr[n -1] -  arr[0];
		int ans = -1;
		
		while ( low <= high) {
			int mid = low + ( high - low)/2;
			
			if ( distance(arr, mid, m) == true) {
				low =  mid + 1;
				ans = mid;
			}
			else {
				high = mid -1 ;
			}
			
		}
		return ans;
		
	}
	
//	function to find if we can place m balls with least distance
	public static boolean distance ( int[] arr, int mid , int m) {
		int ballCount = 1;
		int pos = arr[0];
		
		for ( int i = 1; i < arr.length ; i++ ) {
			if ( (arr[i] - pos) >= mid ) {
				ballCount++;
				pos = arr[i];
			}
		}
		if ( ballCount >= m) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
