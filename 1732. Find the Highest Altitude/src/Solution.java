public class Solution {

    public static void main() {

        int[] gain = { -4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));

    }

    private static int largestAltitude(int[] gain){

        int max = 0;
        int current = 0;

        for ( int num : gain){
            current += num;
            max = Math.max(current, max);
        }

        return max;
    }
}
