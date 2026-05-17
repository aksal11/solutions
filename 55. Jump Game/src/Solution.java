public class Solution {

    public static void main() {

        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));

    }

    private static boolean canJump(int[] nums){

        int max = 0;

        for ( int i = 0 ; i < nums.length; i++){

            if ( max < i){
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }


}
