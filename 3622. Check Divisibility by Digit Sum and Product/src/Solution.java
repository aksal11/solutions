public class Solution {

    public static void main(String[] args) {

        int n = 23;

        System.out.println(checkDivisibility(n));

    }

    private static boolean checkDivisibility(int n){

        int digitSum = 0;
        int digitProduct = 1;

        int number = n;

        while ( number != 0){
            int digit = number % 10;
            number /= 10;

            digitSum += digit;
            digitProduct += digit;
        }

        return n % ( digitSum + digitProduct) == 0;
    }
}
