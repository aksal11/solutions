import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {0,3,2,1,3,2};
        System.out.println(Arrays.toString(sneakyNumbers(nums)));

    }

    public static int[] sneakyNumbers(int[] nums){

        int[] ans = new int[2];
        int  count = 0;
        for ( int i = 0 ; i < nums.length; i++){
            for ( int j = i + 1; j < nums.length; j++){
                if ( nums[i] == nums[j]){
                    ans[count] = nums[j];
                    count++;
                }
            }
        }
        return ans;
    }
}
