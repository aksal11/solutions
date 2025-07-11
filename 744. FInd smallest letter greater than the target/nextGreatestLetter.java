package solutions;

import java.util.Arrays;

public class nextGreatestLetter {
	
	public static void main (String[] args) {
		char[] letters = {'p','o','g','k'};
		char target = 'a';
		Arrays.sort(letters);
		System.out.println(nextgreatestLetter(letters, target));
	}
	
	public static char nextgreatestLetter(char[] letters, char target) {
		int low = 0;
		int high = letters.length-1;
		
		while ( low <= high) {
			int mid = low + ( high - low)/2;
			
			if ( letters[mid] <= target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
//		if not exist
		return letters[low % letters.length];
	}

}
