public class Solution {

    public static void main() {

        int[] nums = {3,2,1,5,4};
        int k = 2;
        System.out.println(countKDifference(nums,k));

    }

    private static int countKDifference(int[] nums, int k){

        int diff = 0;

        for ( int i = 0; i < nums.length; i++){

            for ( int j = i ;  j< nums.length; j++){

                if ( Math.abs(nums[i] - nums[j]) == k){

                    diff++;
                }
            }
        }
        return diff;
    }
}
