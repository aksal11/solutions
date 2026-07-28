import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = { 1,2,3,4};
        System.out.println(maximumProduct(nums));

    }

    private static  int maximumProduct(int[] nums){

        Arrays.sort( nums);

        int n = nums.length;

//        largest 3
        int product = nums[n-1] * nums[n-2] * nums[n-3];

//        2 smallest neg and largest num
        int product2 = nums[0] * nums[1] * nums[n-1];

        return  Math.max( product, product2);
    }
}
