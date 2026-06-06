import java.util.Arrays;

public class Solution {

    public static void main() {
        int[] nums= {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));

    }

    private static int[] leftRightDifference(int[] nums){

        int[] rightSum = new int[nums.length];
        int[] leftSum = new int[nums.length];

//        rightSum
        rightSum[0] = 0;
        for ( int i =1 ; i < nums.length; i++){
            rightSum[i] = rightSum[i-1] + nums[i-1];
        }

//        leftSum
        leftSum[nums.length-1] = 0;
        for ( int i = nums.length-2; i>=0; i--){
            leftSum[i] = leftSum[i+1] + nums[i+1];
        }

        int[] ans = new int[nums.length];
        for ( int i = 0 ; i < nums.length; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
