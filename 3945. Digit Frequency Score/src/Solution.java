public class Solution {

    public static void main() {

        int n = 122;
        System.out.println(digitFrequencyScore(n));

    }

    private static int digitFrequencyScore(int n){

        int[] freq = new int[10];

        while ( n > 0){
            freq[n % 10]++;
            n /= 10;
        }

        int ans = 0;
        for ( int d =0; d < 10 ; d++){
            ans += d * freq[d];
        }

        return ans;
    }
}
