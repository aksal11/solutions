public class Solution {
    public static void main(String[] args) {

        int[] arr = {10,3,1,1};
        System.out.println(minimumCost(arr));

    }

    public static int minimumCost(int[] nums){
        int ans = nums[0];
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;

        for ( int i = 1; i<nums.length;i++){
            if ( nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }else if( nums[i] < min2){
                min2 = nums[i];
            }
        }

        return ans+min1+min2;
    }
}
