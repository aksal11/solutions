import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        int[] nums ={8,19,4,2,15,3};
        int original = 2;
        System.out.println(findFinalValue(nums,original));

    }

    public static int findFinalValue(int[] nums, int original){


        HashSet<Integer> set= new HashSet<>();

        for( int num: nums){
            set.add(num);
        }

        while ( set.contains(original)){
            original*=2;
        }
        return original;

//        for ( int i =0; i < nums.length; i++){
//            if ( nums[i] == original){
//                original*=2;
//                for ( int j = 0 ; j < set.size(); j++){
//                    if ( set.contains(original)){
//                        original*=2;
//                    }else{
//                        return original;
//                    }
//                }
//            }
//        }
//        return original;

    }
}
