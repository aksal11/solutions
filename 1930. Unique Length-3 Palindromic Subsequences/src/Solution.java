import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        String s = "bbcbaba";
        System.out.println(countPalindromicSubSequence(s));

    }

    public static int countPalindromicSubSequence(String s){


        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first,-1);

//        count the first and last occurrences
        for ( int i  = 0 ; i < n ; i++){
            int c = s.charAt(i) - 'a';
            if ( first[c] == -1) first[c] = i;
            last[c] =i;
        }

        int result = 0 ;
        for ( int c  = 0 ; c< 26; c++){
            int l = first[c];
            int r = last[c];

            if ( l != -1 && l < r){

                boolean[] mid = new boolean[26];
//                count the mid-occurrences
                for ( int i = l + 1; i < r; i++){
                    mid[s.charAt(i)-'a']=true;
                }


                for ( boolean b : mid){
                    if (b) result++;
                }
            }
        }
        return result;
    }
}
