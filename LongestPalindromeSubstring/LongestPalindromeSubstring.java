package problem;

public class LongestPalindromeSubstring {
	
	
	
	public static void main(String[] args) {
		String s ="aabbaabd";
		
		System.out.println(" the answer is "+solution(s));
	}
	
	
	public static String solution(String s) {
		String result="";
		
		if (s.length() < 1) return s;
		
		
		for ( int i =0 ; i< s.length() ; i++) {
			
			
//			IF THE LENGTH IS ODD
			
//			two pointers - left and right
			
			int left = i;
			int right = i;
			
//			condition for checking if the characters are same or not
			while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
				left--;
				right++;
				
				
//				check the boundaries of left and right- this is unnecessary
				if ( left == -1 || right == s.length()) {
					break;
				}
			}
			
//			extracting the substring
			String palindrome= s.substring(left+1, right);
			if ( palindrome.length() > result.length()) {
				result = palindrome;
			}
			
			
//			IF THE LENGTH IS EVEN
			
			left = i-1;
			right = i;
			
			while ( left >= 0 && right < s.length() && s.charAt(left)== s.charAt(right)) {
				left--;
				right++;
				
				
				if ( left == -1 | right == s.length()) {
					break;
				}
			}
			
			palindrome = s.substring(left+1, right);
			if ( palindrome.length() > result.length()) {
				result = palindrome;
			}
		}
		
		return result;
	
	}

}
