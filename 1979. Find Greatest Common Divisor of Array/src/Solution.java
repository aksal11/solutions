public class Solution {

    public static void main(String[] args) {

        int[] nums = { 7,5,6,8,3};
        System.out.println(findGCD(nums));



    }

    private static int findGCD(int[] nums){
        int max = nums[0];
        int min = nums[0];

//        min and max
        for ( int num :nums){
            if ( num < min){
                min = num;
            }
            if ( num >  max){
                max = num;

            }
        }

        return gcd(min, max);
    }


    private static int gcd( int a , int b){
        while ( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
