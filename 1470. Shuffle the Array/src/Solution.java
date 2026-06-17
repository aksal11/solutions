import java.util.Arrays;

public class Solution {

    public static void main() {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }

    private static int[] shuffle(int[] nums, int n){

        int[] ans = new int[ 2 * n];
        int ansIndex = 0;

        for ( int i = 0 ; i < n; i++){

//            first half
            ans[ansIndex] = nums[i];
            ansIndex++;

//            second half
            ans[ansIndex] = nums[i + n];
            ansIndex++;


        }
        return ans;
    }
}
