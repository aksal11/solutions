public class Solution {

    static void main() {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));

    }

    private static int pivotIndex( int[] nums){

        int rightSum = 0;

        for ( int num : nums){
            rightSum += num;
        }

        int leftSum = 0;

        for ( int i = 0 ; i < nums.length; i++){

            rightSum -= nums[i];

            if ( leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
