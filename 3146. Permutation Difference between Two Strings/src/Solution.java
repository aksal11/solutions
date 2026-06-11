public class Solution {

    static void main() {

        String s = "abcde";
        String t = "edbac";
        System.out.println(findPermutationDifference(s,t));

    }

    private static int findPermutationDifference(String s, String t){

        int sum = 0;

        for ( int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);

            int idx1 = s.indexOf(c);
            int idx2 = t.indexOf(c);
            sum = sum + Math.abs((idx1-idx2));
        }

        return sum;
    }
}
