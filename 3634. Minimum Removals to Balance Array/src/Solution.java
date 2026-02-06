import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,6,2,9};
        int k = 3;
        System.out.println(minRemoval(nums,k));

    }

    public  static int minRemoval(int[] nums, int k){

        Arrays.sort(nums);
        int left = 0;
        int maxLength = 0 ;

        for ( int  right = 0 ; right < nums.length; right++){

            while ( (long) nums[left] * k < (long) nums[right]) {
                left++;
            }
            maxLength = Math.max(maxLength, right - left +1);


        }
        return nums.length - maxLength;
    }
}
