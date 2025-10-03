import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }

    public static List<Integer> majorityElement(int[] nums){



        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for( int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for ( int key: map.keySet()){
            if ( map.get(key) > n/3){
                result.add(key);
            }
        }

        return result;
    }


}
