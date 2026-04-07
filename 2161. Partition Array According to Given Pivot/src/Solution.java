import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] ans = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(ans, pivot)));

    }

    public static int[] pivotArray(int[] nums, int pivot){

        int n = nums.length;
        int idx = 0;

        int[] ans = new int[n];

//        elements < pivot
        for ( int num:nums){
            if ( num < pivot){
                ans[idx] = num;
                idx++;
            }
        }

//        elements == pivot
        for (int num :nums){
            if ( num == pivot){
                ans[idx] =  num;
                idx++;
            }
        }

//        elements > idx
        for ( int num : nums){
            if ( num > pivot){
                ans[idx] = num;
                idx++;
            }
        }

        return ans;
    }
}
