public class Solution {

    public static void main(String[] args) {

        int[] nums = {5,0,1,4};
        int  k =3;
        System.out.println(firstStableIndex(nums,k));


    }

    private static int firstStableIndex(int[] nums, int k){

        int n = nums.length;

        for ( int i = 0; i < n; i++){

//            max from index 0 to i
            int leftMax = nums[0];
            for (int j = 1; j <= i ; j++) {
                leftMax = Math.max(leftMax, nums[j]);
            }

//           minimum from i to n-1
            int rightMin = nums[i];
            for ( int j = i + 1; j < n; j++){
                rightMin = Math.min(rightMin, nums[j]);
            }

            int score = leftMax - rightMin;

            if ( score <= k){
                return i;
            }

        }

        return -1;
    }
}
