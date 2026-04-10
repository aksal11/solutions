public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,2,1,1,3};
        System.out.println(minimumDistance(nums));

    }

    private static int minimumDistance(int[] nums){

        int n = nums.length;

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for ( int i = 0 ; i < n; i++){
            for ( int j = i+ 1; j < n ; j++){
                for ( int k = j +1; k< n; k++){

                    if  ( nums[i] == nums[j] && nums[j] ==  nums[k]){
                         sum = Math.abs( i - j) + Math.abs(j - k) + Math.abs(k - i);
                         min = Math.min(min, sum);
                    }
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1: min;
    }
}
