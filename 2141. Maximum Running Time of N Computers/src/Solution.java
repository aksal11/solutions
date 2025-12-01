public class Solution {

    public static void main(String[] args) {

        int n  = 2;
        int[] batteries = { 1,1,1,1};
        System.out.println(maxRunTime(n,batteries));

    }

    public static long maxRunTime(int n , int[] batteries){

        long left = 0;
        long right  = 0;
        for ( int battery : batteries){
            right += battery;
        }

        while ( left < right){
            long mid = ( left + right +1)/2;

            long usable =  0;
            for ( int battery: batteries){
                usable += Math.min(mid, battery);
            }

            if ( usable >= n * mid){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
