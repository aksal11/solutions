import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[]  nums ={ 1,100};
        System.out.println(canMakeArithmeticProgression(nums));

    }

    public static boolean canMakeArithmeticProgression(int[] arr){
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int  i =2; i< arr.length;i++){
            if( arr[i] - arr[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}
