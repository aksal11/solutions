import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] nums={5,1};
        System.out.println(findMissingElements(nums));

    }

    private static List<Integer> findMissingElements(int[] nums){

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int num :nums){
            min = Math.min(min, num);
            max = Math.max(max, num);

        }

        for (int num: nums){
            set.add(num);
        }

        for ( int num = min; num <= max; num++){
            if ( !set.contains(num)){
                ans.add(num);
            }
        }
        return ans;

    }
}
