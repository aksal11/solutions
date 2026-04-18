public class Solution {

    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.println(minBitFlips(start,goal));
    }


    private static int minBitFlips(int start, int goal){

        int res = start ^ goal;
        return Integer.bitCount(res);
    }
}
