public class Solution {

    public static void main(String[] args) {

        int[] nums = {2,3,1,5,4};
        int[][] queries = {{1,4,2,3},{0,2,1,2}};
        System.out.println(xorAfterQueries(nums,queries));


    }

    public static int xorAfterQueries(int[] nums, int[][] queries){

        int mod = 1000000007;

        for ( int[] q : queries){
            int li = q[0];
            int ri = q[1];
            int ki = q[2];
            int vi = q[3];

            for ( int idx = li ; idx <= ri ; idx += ki){
                nums[idx] = (int)((1L * nums[idx] * vi) % mod );
            }
        }

        int result =0;
        for ( int num: nums){
            result ^= num;
        }

        return result;
    }
}
