import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {4,2,3,1};
        System.out.println(minimumAbsDifference(arr));

    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr){
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        List<List<Integer>> ans = new ArrayList<>();
        for ( int i =1; i < arr.length; i++){
            int difference = Math.abs(arr[i] - arr[i-1]);
            min = Math.min(min, difference);
        }

        for ( int i=1 ; i< arr.length; i++){
            if ( arr[i] - arr[i-1] == min){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }

        return ans;
    }
}
