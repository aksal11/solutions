package solutions;

public class FirstAndLast {
	
	public static void main(String[] args) {
		
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		
		int result[] = searchRange(nums, target);
		System.out.println(result[0]+" "+result[1]);
	}
	
	public static int[] searchRange(int[] nums, int target) {
		
		
		int[] result = {-1,-1}; // default case if target is not present
		
//		find the leftmost index of the target
		result[0] = left(nums,target);
		if (result[0] == -1) {  //if the target is not found, return default
			return result;
		}
		
//		find the rightmost index of the target
		result[1] = right(nums,target);
		
		return result;
		
	}
	
//	left side
	public static int left(int[] nums,int target) {
		
		
		int low = 0 ; 
		int high = nums.length - 1;
		
		int leftResult = -1;
		
		while ( low <= high) {
			int mid = low + (high -  low)/2;
			
			if ( nums[mid] == target) {
				leftResult = mid;
				high = mid -1;
			}
			else if ( nums[mid] > target) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return leftResult;
	}
	
	
//	right side
	public static int right (int[] nums, int target) {
		
		int low = 0 ;
		int high = nums.length - 1;
		
		int rightResult = -1; 
		
		while ( low <= high ) {
			
			int mid = low + ( high - low )/2;
			
			if ( nums[mid] ==  target) {
				rightResult = mid;
				low = mid + 1;
				
			}
			else if ( nums[mid] < target) {
				low = mid +1;
			}
			else {
				high = mid -1;
			}
		}
		return rightResult;
	}

}
