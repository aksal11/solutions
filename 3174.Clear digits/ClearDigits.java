package solutions;

public class ClearDigits {
	
	public static void main(String[] args) {
		
		String s = "abc";
		System.out.println(clearDigits(s));
		
	}
	
	public static String clearDigits(String s) {
		
		int n = s.length();
		
		StringBuilder sb = new StringBuilder();
		
		for ( char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length()-1);
				}
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
