public class Solution {

    public static void main(String[] args) {
        int[] nums  = { 3,0,1};
        System.out.println( missingNumber(nums));

    }

    public static int missingNumber(int[] nums){

        int n =  nums.length;
        int real = n * ( n+1)/2;
        int sum = 0;
        for ( int num :nums){
            sum += num;
        }

        return ( real - sum);
    }
}
