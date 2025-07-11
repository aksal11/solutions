package solutions;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
		
	}
	
	
	public static int[] productExceptSelf(int[] nums) {
		
		int n = nums.length;
		
		int[] ans = new int[n];
		ans[0] = 1;
		
		
//		left to right prefix
		for ( int i = 1; i< n ; i++) {
			
			ans[i] = ans[i-1] * nums[i-1];
		}
		
//		right to left suffix
		int suffix = 1;
		for ( int i = n-1; i>= 0 ; i--) {
			ans[i] = ans[i] * suffix;
			suffix = suffix * nums[i];
		}
		
		return ans;
	}

}
