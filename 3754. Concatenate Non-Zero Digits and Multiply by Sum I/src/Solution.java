public class Solution {

    public static void main() {

        int n = 10203004;
        System.out.println(sumAndMultiply(n));

    }

    private static long sumAndMultiply(int n){


        if ( n == 0) return 0;

        String s = String.valueOf(n);

        int x = 0;
        int sum = 0;

        for ( char c : s.toCharArray()){

            int digit = c-'0';
            if ( digit != 0){
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return (long)x * sum;
    }
}
