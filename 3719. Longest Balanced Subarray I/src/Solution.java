import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {3,2,2,5,4 };

        System.out.println(longestBalanced(nums));
    }


    public static int longestBalanced(int[] nums){

        int maxLength = 0;

        for (int i = 0 ; i < nums.length; i++){

            HashSet<Integer> oddSet = new HashSet<>();
            HashSet<Integer> evenSet = new HashSet<>();

            for ( int j = i; j < nums.length; j++){

                if ( nums[j] % 2 == 0){
                    evenSet.add(nums[j]);
                }else{
                    oddSet.add(nums[j]);
                }

                if ( oddSet.size() ==  evenSet.size()){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}
