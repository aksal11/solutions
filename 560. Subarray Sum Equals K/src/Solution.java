public class Solution {

    public static void main(String[] args) {
        int k = 3;
        int[] nums  = {1,2,3};
        System.out.println(subArraySum(nums,k));

    }

    public static int subArraySum(int[] nums, int k){
        int ans = 0;
        for ( int i  = 0 ; i < nums.length; i++){
            int sum  = 0 ;
            for ( int j = i ; j < nums.length; j++){
                sum += nums[j];
                if ( sum == k){
                    ans++;
                }
            }

        }
        return ans;
    }
}
