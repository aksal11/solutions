import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.print(Arrays.toString(getConcat(nums)));

    }

    public static int[] getConcat(int[] nums){

        int[] ans = new int[nums.length * 2];
        for ( int i = 0 ; i < nums.length; i++){
            ans[i] = ans[nums.length + i] = nums[i];
        }
        return ans;

    }
}
