public class Solution {

    public static void main(String[] args) {

        int[]nums = { 1,0,0,0,1,0,0,1};
        int k = 2;
        System.out.println(klengthPart(nums,k));

    }

    public static boolean klengthPart(int[] nums, int k){

//        previous index
        int previous = -1;
        for ( int i = 0 ; i < nums.length; i++){
//            check if current index is 1
            if ( nums[i] == 1){
//                check the distance between the previous one
                if ( previous != -1 && i - previous - 1 <k){
                    return false;
                }
            }
        }
        return  true;
    }
}
