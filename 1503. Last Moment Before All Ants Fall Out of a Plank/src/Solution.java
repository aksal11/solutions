public class Solution {

    public static void main( String[] args) {

        int n = 4;
        int[] left = {4,3};
        int[] right = {0,1};
        System.out.println(getLastMoment(n,left,right));

    }

    private static int getLastMoment(int n, int[] left, int[] right){

        int maxTime = 0;

        for (int position : left){
            maxTime = Math.max(maxTime, position);

        }

        for ( int position : right){

            maxTime = Math.max(maxTime, n - position);

        }
        return maxTime;
    }
}
