package solutions;

public class RotatedSortedArrayI {
	
	
	public static void main(String[] args) {
//		input array
		int[] nums = {4,5,6,7,0,1,2};
		
		System.out.println(" "+search(nums, 9));
	}
	
	
	public static int  search(int[] nums, int target) {
		
		
		int low = 0;
		int high = nums.length - 1;
		
		while ( low <= high) {
			
			int mid = low + ( high - low)/2;
			
			if ( nums[mid] == target) {
//				the target element is found
				return mid;
			}
//			searching for the element in left portion
			else if ( nums[low] <= nums[mid]) {
				if ( nums[low] <=  target && target < nums[mid]) {
					high = mid -1;
				}
				else {
					low = mid + 1;
				}
				
			}
//			searching for the element in right portion
			else {
				if ( nums[high] < target && target <= nums[high]) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
		}
		return -1;
		
	}
	
	

}
