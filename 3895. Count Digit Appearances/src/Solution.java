public class Solution {

    public static void main() {

        int[] nums = {12,54,32,22};
        int digit = 2;
        System.out.println(countDigitOccurrences(nums, digit));

    }

    private static int countDigitOccurrences(int[] nums, int digit){


        int ans = 0;

        for ( int i = 0 ; i < nums.length; i++){
            while ( nums[i] >0){
                if ( nums[i] % 10 ==  digit){
                    ans++;
                }
                nums[i] /= 10;
            }
        }
        return ans;
    }
}
