public class Solution {

    static void main() {

        String s = "zaza";
        System.out.println(reverseDegree(s));

    }

    private static int reverseDegree(String s){

        int ans = 0;
        for ( int i = 0 ;i< s.length(); i++){

            int value = 'z'-s.charAt(i) +1;
            ans += value * ( i+1);
        }
        return ans;
    }
}
