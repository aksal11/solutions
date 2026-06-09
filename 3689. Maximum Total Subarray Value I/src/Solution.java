public class Solution {

    static void main() {

        int k = 3;
        int[] nums = {4,2,5,1};

        System.out.println(maxTotalValue(nums, k));

    }

    private static long maxTotalValue(int[] nums, int k){


        int maxValue = nums[0];
        int minValue = nums[0];

        for ( int num : nums){
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }

        return 1L * k * ( maxValue - minValue);
    }


}
