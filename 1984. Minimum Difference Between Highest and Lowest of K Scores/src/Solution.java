import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] nums= {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums,k));

    }

    public static int minimumDifference(int[] nums, int k){

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for ( int i =0 ; i + k -1 < nums.length; i++){
            int difference = nums[i+k-1] - nums[i];
            min = Math.min(difference, min);
        }

        return min;
    }



}
