public class Solution {


    public static void main(String[] args) {

        int[] nums = { 0,1,1,1,0,1,1,0,1 };
        System.out.println(longestSubArray(nums));

    }

    public static int longestSubArray(int[] nums){


        int n = nums.length;
        int previousOnes = 0 ;
        int currentOnes = 0;
        int max = 0;

        for ( int i = 0 ; i <n;i++){
            if (nums[i] == 1){
                currentOnes++;
            }else{
//                hit zero
                max = Math.max(max, previousOnes + currentOnes);
                previousOnes = currentOnes;
                currentOnes = 0;
            }
        }

        max = Math.max(max, previousOnes + currentOnes);
        if (max == n)return n-1;
        return max;
    }
}
