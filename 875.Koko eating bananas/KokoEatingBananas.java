package solutions;

public class KokoEatingBananas {
	
	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println(eatingspeed(piles, h));
	}
	
	public static int eatingspeed(int[] piles, int h) {
		int low = 1;
		int high = findMaxx(piles );
		
		while (low <= high) {
			int mid = low + ( high - low)/2;
			int totalHours = totalHours(piles,mid);
			if (totalHours <= h) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return low;
	}
	
	public static int findMaxx(int[] piles) {
		int max = Integer.MIN_VALUE;
		for ( int pile : piles) {
			 max = Math.max( max,pile);
		}
		return max;
	}
	
	public static int totalHours(int[] piles, int speed) {
		int total = 0;
		for ( int pile : piles) {
			total += Math.ceil((double)pile/speed);
		}
		return total;
	}

}
