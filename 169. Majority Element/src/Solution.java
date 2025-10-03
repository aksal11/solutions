import java.util.HashMap;

public class Solution {


    public static void main(String[] args) {

        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for ( int key : map.keySet()){
            if ( map.get(key) > nums.length/2){
                return key;
            }
        }

        return -1;
    }
}
