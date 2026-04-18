public class Solution {


    public static void main(String[] args) {
        int n = 10;
        System.out.println(mirrorDistance(n));
    }

    private static  int mirrorDistance(int n){


        int diff = Math.abs(n - reverse(n));
        return diff;


    }

    private static int reverse(int n){

        int rev = 0;
        while ( n != 0){
            int digit = n % 10;
            rev = rev *10 + digit;
             n /=10;
        }
        return rev;
    }
}
