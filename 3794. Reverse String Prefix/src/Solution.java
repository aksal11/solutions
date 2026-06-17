public class Solution {

    static void main() {

        String s = "abcd";
        int k = 2;
        System.out.println(reversePrefix(s,k));

    }

    private static String reversePrefix(String s, int k){

        char[] chars = s.toCharArray();
        int left = 0;
        int right = k-1;

        while ( left < right){


            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
