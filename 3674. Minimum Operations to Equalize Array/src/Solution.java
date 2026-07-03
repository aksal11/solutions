public class Solution {

    public static void main() {

        int[] nums = {1,2};
        System.out.println(minOperations(nums));


    }

    private static int minOperations(int[] nums){

//        If every element is equal to nums[0]:
//        return 0
//        Else:
//        return 1

        for ( int i = 1; i < nums.length; i++){
            if  ( nums[i] != nums[0]){
                return 1;
            }
        }
        return  0;
    }
}
