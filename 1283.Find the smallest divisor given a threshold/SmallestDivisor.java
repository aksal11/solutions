package solutions;

public class SmallestDivisor {
	
	public static void main(String[] args) {
		int[] nums = {1,2,5,9};
		int threshold = 6;
		System.out.println(smallestDiv(nums,threshold));
		
		
		
	}
	
	public static int  smallestDiv(int[] nums, int threshold) {
		int low = 1;
		int high = maxx(nums);
		
		while ( low <= high) {
			int mid = low +( high - low)/2;
			
			if (sum(nums,mid) <= threshold) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return low;
	}
		
	
//	to get the max element
	public static int maxx(int[] nums) {
		int max = Integer.MIN_VALUE;
		for ( int i = 0; i< nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		return max;
	}
	
//	divisor 
	public static int sum(int[] nums, int mid) {
		int sum = 0;
		for ( int i = 0; i< nums.length; i++) {
			sum+= Math.ceil((double)nums[i]/mid);
		}
		return sum;
	}
	

}
