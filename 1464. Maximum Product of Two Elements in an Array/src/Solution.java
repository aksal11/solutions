public class Solution {

    public static void main(String[] args) {

        int[] nums = {1,5,4,5};
        System.out.println(maxProduct(nums));

    }

    private static int  maxProduct(int[] nums){

        int first = 0, second = 0;

        for ( int num : nums){
            if ( num > first){
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }
        return (first -1 )* (second -1);
    }
}
