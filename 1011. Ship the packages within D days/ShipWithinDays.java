package solutions;

// 1011. Capacity to ship packages within D days

public class ShipWithinDays {
	
	public static void main(String[] args) {
		int[] weights = {1,2,3,1,1};
		int days = 4;
		System.out.println(shipwithindays(weights, days));
		
	}
	
	public static int shipwithindays(int[] weights, int days) {
		
		int low = max(weights);
		int high = sum(weights);
		
		while ( low <= high) {
			int mid = low +(high - low )/2;
			
			int req = calculateDays(weights, mid);
			if ( req <= days) {
				high = mid -1;
			}
			else {
				low = mid + 1;
			}
		}
		return low;
	}
	
	
//	 to find the max element
	public static int max(int[] weights) {
		int max = Integer.MIN_VALUE;
		for ( int i = 0;i <= weights.length-1; i++){
			max = Math.max(max, weights[i]);
		}
		return max;
	}
	
//	to find sum
	public static int sum(int[] weights) {
		int sum = 0;
		for (int i =0 ;  i<= weights.length -1; i++) {
			sum+=weights[i];
		}
		return sum;
	}
	
	public static int calculateDays(int[] weights, int mid) {
		int load = 0;
		int day = 1;
		
		for (int i = 0; i <= weights.length-1 ; i++) {
			if (load + weights[i] > mid) {
				day++;
				load = weights[i];
			}
			else {
				load += weights[i];
			}
		}
		return day;
	}
	
	
	
}
