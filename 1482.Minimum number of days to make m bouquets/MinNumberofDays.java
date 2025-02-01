package solutions;

public class MinNumberofDays {
	
	public static void main(String[] args) {
		int[] bloomDay = {7, 7, 7, 7, 13, 11, 12, 7};
		int k = 3;
        int m = 2;
        int ans = minDays(bloomDay, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
	}
	
	public static int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n = bloomDay.length; // size of the array
        if (val > n) return -1; // impossible case
        
        // Find min and max values
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        // Apply binary search
        int low = min, high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean possible(int[] arr, int day, int m, int k) {
        int count = 0; // consecutive bloomed flowers
        int bloom = 0; // total bouquets
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++; // flower bloomed
                if (count == k) {
                    bloom++; // bouquet formed
                    count = 0; // reset
                }
            } else {
                count = 0; // reset sequence
            }
        }
        return bloom >= m;
    }
	
	

}
