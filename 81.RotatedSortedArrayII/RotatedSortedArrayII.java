package solutions;

public class RotatedSortedArrayII {
	
	public static void main(String[] args) {
		
		
//		input array
		int[] nums = {2,5,6,0,0,1,2};
		
		System.out.println(" "+search(nums, 5));
	}
	
	
	
	
	public static boolean search( int[] nums, int  target) {
		
		int low = 0;
		int high = nums.length -1;
		
		while ( low <= high) {
			
			int mid = low + ( high - low )/2;
			
			if ( nums[mid] ==  target) {
				return true;
			}
			
//			if the low value == mid value and mid value == high value
			if ( nums[low] ==  nums[mid] && nums[mid] == nums[high]) {
				low++;
				high--;
			}
			else if ( nums[low] <= nums[mid]) {
				if ( nums[low] <= target && target < nums[mid]) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			else {
				if ( nums[mid] < target && target <= nums[high] ) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
			
		}
		
		
		return false;
	}

}
