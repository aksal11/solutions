import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {0,1,1,1,1,1 };
        System.out.println(prefixDivBy5(arr));

    }

    public static List<Boolean>  prefixDivBy5(int[] nums){

        List<Boolean> ans = new ArrayList<>();
        int rem  =0;
        for (int num :nums){
            rem = ( rem * 2 + num) % 5;
            ans.add(rem == 0);
        }
        return ans;

    }
}
