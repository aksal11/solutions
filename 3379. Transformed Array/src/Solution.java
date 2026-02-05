import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {3,-2,1,1};
        System.out.println(Arrays.toString(constructTransformedArray(nums)));

    }

    public static int[] constructTransformedArray(int[] nums){

        int[] result = new int[nums.length];

        for (int i =0; i< nums.length;i++){

            if ( nums[i] > 0){
//                move right
                int index = (nums[i] +i) % nums.length;

                result[i] =nums[index];
            }else if ( nums[i] < 0){

//                move left
                int index = (i + nums[i]) % nums.length;

                if ( index < 0){
                    index += nums.length;
                }
                result[i] = nums[index];
            } else if (nums[i] == 0) {
                result[i] = nums[i];

            }
        }
        return result;
    }
}
